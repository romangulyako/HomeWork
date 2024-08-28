package home_work_5.creators;

import home_work_5.api.ICreator;
import home_work_5.api.IGenerator;
import home_work_5.dto.Animal;

import java.util.Random;

public class AnimalCreator implements ICreator<Animal> {
    private final IGenerator nickGenerator;
    private int minAge;
    private int maxAge;

    private Random rnd = new Random();

    public AnimalCreator(IGenerator nickGenerator, int minAge, int maxAge) {
        this.nickGenerator = nickGenerator;
        this.minAge = minAge;
        this.maxAge = maxAge;

    }

    @Override
    public Animal create() {
        int age = minAge + rnd.nextInt(maxAge - minAge + 1);
        return new Animal(age, nickGenerator.generate());
    }
}
