package home_work_5.generators;

import home_work_5.api.IGenerator;

import java.io.FileReader;
import java.io.IOException;

public class RandomStringFromFileGenerator implements IGenerator {

    private final String path;


    public RandomStringFromFileGenerator(String path) {
        this.path = path;
    }

    @Override
    public String generate() {
        StringBuilder builder = new StringBuilder();

        try {
            FileReader reader = new FileReader(this.path);

            int symbol;
            while((symbol=reader.read())!=-1){
                builder.append((char) symbol);
            }
        } catch (IOException e) {
            throw new RuntimeException("Ошибка работы с файлом");
        }


        String textFromFile = builder.toString();

        textFromFile = textFromFile.replaceAll("\\W+", " ");
        textFromFile = textFromFile.trim();

        String[] array = textFromFile.split(",");

        return new RandomStringFromArrayGenerator(array).generate();
    }
}
