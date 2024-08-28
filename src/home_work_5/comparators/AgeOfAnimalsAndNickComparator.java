package home_work_5.comparators;

import home_work_5.dto.Animal;

import java.util.Comparator;

public class AgeOfAnimalsAndNickComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal a1, Animal a2) {
        int age1 = a1.getAge();
        int age2 = a2.getAge();

        if (age1 != age2) {
            return age1 - age2;
        }

        return a1.getNick().compareTo(a2.getNick());
    }
}
