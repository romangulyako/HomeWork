package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class CalculatorStringExpression {

    private ICalculator calc;

    public CalculatorStringExpression(ICalculator calc) {
        this.calc = calc;
    }

    public boolean validation(String expression) {
        String newExp = expressionWithoutSpaces(expression);

        String regex = "^-?(\\(*(\\(?-?(\\d+\\.?\\d*)|PI|E)\\)?)([-+*/^](\\(*-?((\\d+\\.?\\d*)|PI|E))\\)*)+";
        if(newExp.matches(regex)){
            Pattern patternLeftBracket = Pattern.compile("\\(");
            Pattern patternRightBracket = Pattern.compile("\\)");

            Matcher matcherLeftBracket = patternLeftBracket.matcher(newExp);
            Matcher matcherRightBracket = patternRightBracket.matcher(newExp);

            int countOfLeftBracket = 0;
            int countOfRightBracket = 0;

            while (matcherLeftBracket.find()) {
                countOfLeftBracket++;
            }
            while (matcherRightBracket.find()) {
                countOfRightBracket++;
            }

            return countOfLeftBracket == countOfRightBracket;
        } else {
            return false;
        }
    }

    private String expressionWithoutSpaces(String expression) {
        String regex = "\\s";
        return expression.replaceAll(regex,"");
    }

    public String calculate(String expression) {
        return sumOrSubtract(
                divide(
                        multiply(
                                pow(
                                        expressionWithBrackets(
                                                replaceNumsInBrackets(
                                                    replacePI(
                                                            replaceE(
                                                                    expressionWithoutSpaces(expression)))))))));
    }

    private String replacePI(String expression) {
        String newExpression = expression;
        String regex = "PI";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(newExpression);

        while (matcher.find()) {
            int start=matcher.start();
            int end=matcher.end();

            String exp = newExpression.substring(start,end);

            newExpression = newExpression.replace(exp,String.valueOf(Math.PI));

            matcher = pattern.matcher(newExpression);
        }

        return newExpression;
    }

    private String replaceE(String expression) {
        String newExpression = expression;
        String regex = "E";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(newExpression);

        while (matcher.find()) {
            int start=matcher.start();
            int end=matcher.end();

            String exp = newExpression.substring(start,end);

            newExpression = newExpression.replace(exp,String.valueOf(Math.E));

            matcher = pattern.matcher(newExpression);
        }

        return newExpression;
    }

    private String replaceNumsInBrackets(String expression) {
        String newExpression = expression;
        String regex = "\\(-?\\d+\\.?\\d*\\)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(newExpression);

        while (matcher.find()) {
            int startInBrackets = matcher.start();
            int endInBrackets = matcher.end();

            String element = newExpression.substring(startInBrackets,endInBrackets);

            String elementWithoutBrackets = element.substring(element.indexOf('(') + 1,(element.indexOf(')')));

            newExpression = newExpression.replace(element,elementWithoutBrackets);

            matcher = pattern.matcher(newExpression);

        }

        return newExpression;
    }

    private String expressionWithBrackets(String expression) {
        String newExpression = expression;
        String regex = "\\(-?\\d+\\.?\\d*([-+*/^]-?\\d+\\.?\\d*)+\\)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(newExpression);

        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();

            String exp = newExpression.substring(start,end);
            exp = exp.substring(exp.indexOf('(') + 1, exp.indexOf(')'));

            String newExp = sumOrSubtract(divide(multiply(pow(exp))));

            newExpression = newExpression.replace("(" + exp + ")",newExp);

            matcher = pattern.matcher(newExpression);
        }

        return newExpression;
    }

    private String pow(String expression) {
        String newExpression = expression;
        String regex = "(\\(-?)?\\d+\\.?\\d?\\)?\\^\\d+\\.?\\d?";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(newExpression);

        while (matcher.find()) {
            int start=matcher.start();
            int end=matcher.end();

            String exp = newExpression.substring(start,end);

            String[] nums = exp.split("\\^");

            if(nums[0].matches("\\(.+\\)")) {
                nums[0] = nums[0].substring(nums[0].indexOf('(') + 1,(nums[0].indexOf(')')));
            }

            double x = Double.parseDouble(nums[0]);
            int y = Integer.parseInt(nums[1]);

            double result = calc.pow(x,y);

            newExpression = newExpression.replace(exp,String.valueOf(result));

            matcher = pattern.matcher(newExpression);
        }

        return newExpression;
    }

    private String multiply(String expression) {
        String newExpression = replaceNumsInBrackets(expression);
        String regex = "\\d+\\.?\\d*\\*-?\\d+\\.?\\d*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(newExpression);

        while (matcher.find()) {
            int start=matcher.start();
            int end=matcher.end();

            String exp = newExpression.substring(start,end);

            String[] nums = exp.split("\\*");

            double x = Double.parseDouble(nums[0]);
            double y = Double.parseDouble(nums[1]);

            double result = calc.multiply(x,y);

            newExpression = newExpression.replace(exp,String.valueOf(result));

            matcher = pattern.matcher(newExpression);
        }

        return newExpression;
    }

    private String divide(String expression) {
        String newExpression = replaceNumsInBrackets(expression);
        String regex = "\\d+\\.?\\d*/-?\\d+\\.?\\d*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(newExpression);

        while (matcher.find()) {
            int start=matcher.start();
            int end=matcher.end();

            String exp = newExpression.substring(start,end);

            String[] nums = exp.split("/");

            double x = Double.parseDouble(nums[0]);
            double y = Double.parseDouble(nums[1]);

            double result = calc.divide(x,y);
            newExpression = newExpression.replace(exp,String.valueOf(result));

            matcher = pattern.matcher(newExpression);
        }

        return newExpression;
    }

    private String sumOrSubtract(String expression) {
        String newExpression = replaceNumsInBrackets(expression);
        String regex = "\\d+\\.?\\d*[-+]-?\\d+\\.?\\d*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(newExpression);

        boolean isNegative = false;

        while (matcher.find()) {
            int start=matcher.start();
            int end=matcher.end();

            String exp = newExpression.substring(start,end);

            String oldExp = exp;

            exp = exp.replace("--","+");
            exp = exp.replace("+-","-");



            String[] nums = exp.split("[-+]");

            double x = Double.parseDouble(nums[0]);
            double y = Double.parseDouble(nums[1]);
            double result = 0;

            if(isNegative) {
                x *= -1;
                newExpression = newExpression.replaceFirst("-","");
            }

            if (exp.matches(".+-.+")) {
                result = calc.subtract(x,y);
            } else if (exp.matches(".+[+].+")) {
                result = calc.sum(x,y);
            }

            if (result < 0) {
                isNegative = true;
            }

            newExpression = newExpression.replace(oldExp, String.valueOf(result));

            matcher = pattern.matcher(newExpression);
        }

        return newExpression;
    }
}
