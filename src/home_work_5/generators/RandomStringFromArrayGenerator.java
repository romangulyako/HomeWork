package home_work_5.generators;

import home_work_5.api.IGenerator;
import home_work_5.exceptions.NullArgumentException;

import java.util.Random;

public class RandomStringFromArrayGenerator implements IGenerator {

    private final String[] array;

    public RandomStringFromArrayGenerator(String[] array) {
        NullArgumentException.check(array);

        if (array.length == 0) {
            throw new IllegalArgumentException("Невозможно передать пустой массив");
        }

        this.array = array;
    }

    @Override
    public String generate() {
        Random rnd = new Random();

        return array[rnd.nextInt(array.length)];
    }
}
