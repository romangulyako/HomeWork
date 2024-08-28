package home_work_5;

import home_work_5.api.ICreator;
import home_work_5.api.IGenerator;
import home_work_5.comparators.AgeOfAnimalsAndNickComparator;
import home_work_5.creators.AnimalCreator;
import home_work_5.dto.Alphabet;
import home_work_5.dto.Animal;
import home_work_5.generators.RandomStringFromArrayGenerator;
import home_work_5.generators.RandomStringFromFileGenerator;
import home_work_5.generators.RandomStringGenerator;
import home_work_5.generators.RandomStringInLanguageGenerator;
import home_work_5.utils.GeneralTestUtils;

public class AnimalMain {
    public static void main(String[] args) {
        String[] nicks = {"Бобик", "Тузик", "Шарик", "Маркиз", "Додик", "Дымок", "Леопольд", "Глаша", "Рекс", "Гарфилд", "Рыжик"};
        String nicksFilePath = "animalsNicks.txt";

        int collectionSize = 100_000;

        CollectionHandler<Animal> handler = new CollectionHandler<>();
        GeneralTestUtils<Animal> testAnimal = new GeneralTestUtils<>(handler,new AgeOfAnimalsAndNickComparator());

        IGenerator nickGenerator = new RandomStringGenerator(4,8);
        ICreator<Animal> animalCreator = new AnimalCreator(nickGenerator,1,15);
        System.out.println("ТЕСТИРОВАНИЕ ЗАПОЛНЕНИЯ КОЛЛЕКЦИИ ОБЪЕКТАМИ Animal С РАНДОМНЫМИ НИКАМИ");
        testAnimal.fillingTest(collectionSize,animalCreator);
        testAnimal.clearAllCollections();

        nickGenerator = new RandomStringInLanguageGenerator(4,8, Alphabet.RU);
        animalCreator = new AnimalCreator(nickGenerator,1,15);
        System.out.println("ТЕСТИРОВАНИЕ ЗАПОЛНЕНИЯ КОЛЛЕКЦИИ ОБЪЕКТАМИ Animal С РАНДОМНЫМИ НИКАМИ НА РУССКОМ");
        testAnimal.fillingTest(collectionSize,animalCreator);
        testAnimal.clearAllCollections();

        nickGenerator = new RandomStringFromFileGenerator(nicksFilePath);
        animalCreator = new AnimalCreator(nickGenerator,1,15);
        System.out.println("ТЕСТИРОВАНИЕ ЗАПОЛНЕНИЯ КОЛЛЕКЦИИ ОБЪЕКТАМИ Animal С РАНДОМНЫМИ НИКАМИ ИЗ ФАЙЛА");
        testAnimal.fillingTest(collectionSize,animalCreator);
        testAnimal.clearAllCollections();

        nickGenerator = new RandomStringFromArrayGenerator(nicks);
        animalCreator = new AnimalCreator(nickGenerator,1,15);
        System.out.println("ТЕСТИРОВАНИЕ ЗАПОЛНЕНИЯ КОЛЛЕКЦИИ ОБЪЕКТАМИ Animal С РАНДОМНЫМИ НИКАМИ ИЗ МАССИВА");
        testAnimal.fillingTest(collectionSize,animalCreator);

        testAnimal.sortingByJdkTest();
        testAnimal.sortingByCollectionHandlerTest();

        testAnimal.iterationByIteratorTest();
        testAnimal.iterationByForTest();

        testAnimal.removeAllWithIteratorTest();
        testAnimal.removeAllTest();
    }
}
