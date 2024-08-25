package home_work_5.comparators;

import home_work_5.dto.Person;

import java.util.Comparator;

public class PasswordLengthComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getPassword().length() - p2.getPassword().length();
    }
}
