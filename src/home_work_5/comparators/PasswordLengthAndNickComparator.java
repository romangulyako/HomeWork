package home_work_5.comparators;

import home_work_5.dto.Person;

import java.util.Comparator;

public class PasswordLengthAndNickComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        int p1Length = p1.getPassword().length();
        int p2Length = p2.getPassword().length();

        if (p1Length != p2Length) {
            return p1Length - p2Length;
        }

        return p1.getNick().compareTo(p2.getNick());
    }
}
