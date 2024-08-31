package home_work_5.generators;

import home_work_5.api.IGenerator;
import home_work_5.exceptions.FileHandlingException;
import home_work_5.exceptions.NullArgumentException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class RandomStringFromFileGenerator implements IGenerator {

    private final String path;


    public RandomStringFromFileGenerator(String path) {
        NullArgumentException.check(path);

        this.path = path;
    }

    @Override
    public String generate() {
        try {
            String textFromFile = readFromFile(path);

            textFromFile = textFromFile.replaceAll("\\W+", " ");
            textFromFile = textFromFile.trim();

            if (textFromFile.isEmpty()) {
                throw new FileHandlingException("Файл " + path + " пустой или не содержит подходящих строк!");
            }

            String[] array = textFromFile.split(" ");

            return new RandomStringFromArrayGenerator(array).generate();


        } catch (FileNotFoundException e) {
            throw new FileHandlingException("Файл " + path + " не найден!");
        } catch (IOException e) {
            throw new FileHandlingException("Ошибка чтения файла  " + path);
        }


    }

    private String readFromFile(String path) throws IOException {
        StringBuilder builder = new StringBuilder();

        FileReader reader = new FileReader(path);

        int symbol;
        while((symbol=reader.read())!=-1){
            builder.append((char) symbol);
        }

        return builder.toString();
    }
}
