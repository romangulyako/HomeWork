package home_work_5;

import home_work_5.api.ICreator;
import home_work_5.api.IGenerator;
import home_work_5.comparators.PasswordLengthAndNickComparator;
import home_work_5.creators.PersonCreator;
import home_work_5.dto.Alphabet;
import home_work_5.dto.Person;
import home_work_5.exceptions.FileHandlingException;
import home_work_5.exceptions.NullArgumentException;
import home_work_5.generators.*;
import home_work_5.utils.GeneralTestUtils;

public class PersonMain {
    public static void main(String[] args) {
        String[] names = {"Ilya", "Roman", "Kirill", "Artem", "Maxim", "Hanna", "Maria", "Mihail", "Evgeniy"};
        String[] nicks = {"nickname1", "nickname2", "nickname3", "nickname4", "nickname5", "nickname6", "nickname7", "nickname8", "nickname9"};
        String namesFilePath = "names.txt";
        String nicksFilePath = "personsNicks.txt";

        int collectionSize = 100_000;

        try {
            CollectionHandler<Person> handler = new CollectionHandler<>();
            GeneralTestUtils<Person> testPerson = new GeneralTestUtils<>(handler,new PasswordLengthAndNickComparator());

            IGenerator nickGenerator = new RandomStringGenerator(3,8);
            IGenerator passwordGenerator = new PasswordGenerator(5,10);
            IGenerator nameGenerator = new RandomStringGenerator(6,12);
            ICreator<Person> personCreator = new PersonCreator(nickGenerator,passwordGenerator,nameGenerator);
            System.out.println("ТЕСТИРОВАНИЕ ЗАПОЛНЕНИЯ КОЛЛЕКЦИИ ОБЪЕКТАМИ Person С РАНДОМНЫМИ ИМЕНАМИ И НИКАМИ");
            testPerson.fillingTest(collectionSize,personCreator);
            testPerson.clearAllCollections();

            nickGenerator = new RandomStringInLanguageGenerator(3,8, Alphabet.EN);
            nameGenerator = new RandomStringInLanguageGenerator(6,12,Alphabet.RU);
            personCreator = new PersonCreator(nickGenerator,passwordGenerator,nameGenerator);
            System.out.println("ТЕСТИРОВАНИЕ ЗАПОЛНЕНИЯ КОЛЛЕКЦИИ ОБЪЕКТАМИ Person С РАНДОМНЫМИ РУССКИМИ ИМЕНАМИ И АНГЛИЙСКИМИ НИКАМИ");
            testPerson.fillingTest(collectionSize,personCreator);
            testPerson.clearAllCollections();

            nickGenerator = new RandomStringFromArrayGenerator(nicks);
            nameGenerator = new RandomStringFromFileGenerator(namesFilePath);
            personCreator = new PersonCreator(nickGenerator,passwordGenerator,nameGenerator);
            System.out.println("ТЕСТИРОВАНИЕ ЗАПОЛНЕНИЯ КОЛЛЕКЦИИ ОБЪЕКТАМИ Person С РАНДОМНЫМИ ИМЕНАМИ ИЗ ФАЙЛА И НИКАМИ ИЗ МАССИВА");
            testPerson.fillingTest(collectionSize,personCreator);
            testPerson.clearAllCollections();

            nickGenerator = new RandomStringFromFileGenerator(nicksFilePath);
            nameGenerator = new RandomStringFromArrayGenerator(names);
            personCreator = new PersonCreator(nickGenerator,passwordGenerator,nameGenerator);
            System.out.println("ТЕСТИРОВАНИЕ ЗАПОЛНЕНИЯ КОЛЛЕКЦИИ ОБЪЕКТАМИ Person С РАНДОМНЫМИ ИМЕНАМИ ИЗ МАССИВА И НИКАМИ ИЗ ФАЙЛА");
            testPerson.fillingTest(collectionSize,personCreator);

            testPerson.sortingByJdkTest();
            testPerson.sortingByCollectionHandlerTest();

            testPerson.iterationByIteratorTest();
            testPerson.iterationByForTest();

            testPerson.removeAllWithIteratorTest();
            testPerson.removeAllTest();
        } catch (NullArgumentException | FileHandlingException | IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
            System.out.print("Подробнее об ошибке: ");
            e.printStackTrace();
        }
    }
}
