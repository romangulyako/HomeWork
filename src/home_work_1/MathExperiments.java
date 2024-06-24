package home_work_1;

public class MathExperiments {
    public static void main(String[] args) {
        int x = 30, y = 60, z = 90;
        double a = 1.7, b = 6.6, c = 34.1;
        System.out.println("Синус числа 30 = " + Math.sin(x));
        System.out.println("Косинус числа 60 = " + Math.cos(x));
        System.out.println("Тангенс числа 90 = " + Math.tan(z));
        System.out.println("Число 60 в квадрате равно " + Math.pow(y,2));
        System.out.println("Число 6.6 округляется до " + Math.round(b));
        System.out.println("Целая часть числа 1.7 равна " +Math.floor(a));
        System.out.println("Корень из числа 34.1 равен " + Math.sqrt(c));
        System.out.println("Между числами 30 и 34.1 большее " + Math.max(x,c));
    }
}
