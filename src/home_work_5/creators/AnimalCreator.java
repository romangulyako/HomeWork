package home_work_5.creators;

import home_work_5.api.ICreator;
import home_work_5.api.IGenerator;
import home_work_5.dto.Animal;
import home_work_5.exceptions.NullArgumentException;
import home_work_5.exceptions.NumberFromRangeException;

import java.util.Random;

public class AnimalCreator implements ICreator<Animal> {
    private final IGenerator nickGenerator;
    private final int minAge;
    private final int maxAge;

    private final Random rnd = new Random();

    public AnimalCreator(IGenerator nickGenerator, int minAge, int maxAge) {
        NullArgumentException.check(nickGenerator);
        NumberFromRangeException.checkCompareMinAndMax(minAge,maxAge);
        NumberFromRangeException.checkPositiveMin(minAge);

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
