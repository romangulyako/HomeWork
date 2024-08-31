package home_work_5;

import home_work_5.api.ICreator;
import home_work_5.exceptions.NullArgumentException;
import home_work_5.utils.SortUtils;

import java.util.*;

public class CollectionHandler<T> {

    /**
     * Метод заполняет коллекцию
     *
     * @param collection коллекция, которую нужно заполнить
     * @param countOfElements количество элементов в коллекции
     * @param elementCreator объект для создания элементов коллекции
     * @throws IllegalArgumentException если количество элементов заполняемой коллекции меньше 1
     * @throws NullArgumentException если collection или elementCreator равен null
     */
    public void fillCollection(Collection<T> collection, int countOfElements, ICreator<T> elementCreator) {
        if (countOfElements <= 0) {
            throw new IllegalArgumentException("Неверный размер коллекции!");
        }

        NullArgumentException.check(collection);
        NullArgumentException.check(elementCreator);

        for (int i = 0; i < countOfElements; i++) {
            collection.add(elementCreator.create());
        }
    }

    /**
     * Метод сортирует коллекцию, реализующую интерфейс List
     *
     * @param collection коллекция, которую нужно отсортировать
     * @param comparator компаратор, которым сортируем коллекцию
     * @throws NullArgumentException если минимум один из аргументов равен null
     */
    public void sort(List<T> collection, Comparator<T> comparator) {
        NullArgumentException.check(collection);
        NullArgumentException.check(comparator);

        T[] array = (T[]) collection.toArray();
        SortUtils<T> sorter = new SortUtils<>(comparator);

        // Возможен StackOverflow. Для этого в классе utils.SortUtils создал еще методы,
        // которые реализуют шейкерную сортировку и сортировку пузырьком
        sorter.quickSort(array,0, array.length - 1);

        collection.clear();
        Collections.addAll(collection, array);
    }

    /**
     * Метод сортирует коллекцию, реализующую интерфейс Set
     *
     * @param collection коллекция, которую нужно отсортировать
     * @param comparator компаратор, которым сортируем коллекцию
     * @throws NullArgumentException если минимум один из аргументов равен null
     * @return отсортированную коллекцию (LinkedHashSet)
     */
    public Set<T> sort(Set<T> collection, Comparator<T> comparator) {
        NullArgumentException.check(collection);
        NullArgumentException.check(comparator);

        T[] array = (T[]) collection.toArray();
        SortUtils<T> sorter = new SortUtils<>(comparator);

        // Возможен StackOverflow. Для этого в классе utils.SortUtils создал еще методы,
        // которые реализуют шейкерную сортировку и сортировку пузырьком
        sorter.quickSort(array,0, array.length - 1);

        return new LinkedHashSet<>(Arrays.asList(array));
    }

    /**
     * Метод итерирует коллекцию с помощью итератора
     *
     * @param collection коллекция, которую нужно проитерировать
     * @throws NullArgumentException если коллекция равна null
     */
    public void iterationByIterator(Collection<T> collection) {
        NullArgumentException.check(collection);

        Iterator<T> iterator = collection.iterator();
        int count = 0;

        while (iterator.hasNext()) {
            iterator.next();
            count++;
        }

        System.out.println("Количество элементов в коллекции: " + count);
    }

    /**
     * Метод итерирует коллекцию с помощью цикла for
     *
     * @param collection коллекция, которую нужно проитерировать
     * @throws NullArgumentException если коллекция равна null
     */
    public void iterationByFor(Collection<T> collection) {
        NullArgumentException.check(collection);

        Object[] array = collection.toArray();
        T element;

        for (int i = 0; i < collection.size(); i++) {
            element = (T)array[i].toString();
        }
    }

    /**
     * Метод удаляет все элементы коллекции с помощью итератора
     *
     * @param collection коллекция, элементы которой нужно удалить
     * @throws NullArgumentException если коллекция равна null
     */
    public void removeAllByIterator(Collection<T> collection) {
        NullArgumentException.check(collection);

        Iterator<T> iterator = collection.iterator();

        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
    }

    /**
     * Метод удаляет все элементы коллекции
     *
     * @param collection коллекция, элементы которой нужно удалить
     * @throws NullArgumentException если коллекция равна null
     */
    public void removeAll(Collection<T> collection) {
        NullArgumentException.check(collection);

        collection.clear();
    }
}
