package home_work_5.generators;

import home_work_5.api.IGenerator;

import java.util.Random;

public class RandomStringFromArrayGenerator implements IGenerator {

    private final String[] array;

    public RandomStringFromArrayGenerator(String[] array) {
        if (array != null && array.length != 0) {
            this.array = array;
        } else {
            throw new IllegalArgumentException("Невозможно передать null или пустой массив");
        }

    }

    @Override
    public String generate() {
        Random rnd = new Random();

        return array[rnd.nextInt(array.length)];
    }
}
