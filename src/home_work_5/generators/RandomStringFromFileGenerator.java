package home_work_5.generators;

import home_work_5.api.IGenerator;

import java.io.FileNotFoundException;
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
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Файл " + path + " не найден!");
        } catch (IOException e) {
            throw new RuntimeException("Ошибка чтения файла  " + path);
        }


        String textFromFile = builder.toString();

        textFromFile = textFromFile.replaceAll("\\W+", " ");
        textFromFile = textFromFile.trim();

        if (textFromFile.isEmpty()) {
            throw new RuntimeException("Файл " + path + " пустой или не содержит подходящих строк!");
        }

        String[] array = textFromFile.split(" ");

        return new RandomStringFromArrayGenerator(array).generate();
    }
}
