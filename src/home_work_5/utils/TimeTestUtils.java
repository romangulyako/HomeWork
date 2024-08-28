package home_work_5.utils;

import home_work_5.api.ICreator;
import home_work_5.CollectionHandler;

import java.util.*;

public class TimeTestUtils<T> {
    private final CollectionHandler<T> handler;

    public TimeTestUtils(CollectionHandler<T> handler) {
        this.handler = handler;
    }

    /**
     * Метод для измерения времени заполнения коллекции
     *
     * @param collection коллекция, которую нужно заполнить
     * @param collectionSize количество элементов, помещаемых в коллекцию
     * @return время заполнения коллекции
     */
    public long fillingCollectionExecutionTime(Collection<T> collection, int collectionSize, ICreator<T> elementCreator) {
        long start = System.currentTimeMillis();
        handler.fillCollection(collection,collectionSize,elementCreator);
        long end = System.currentTimeMillis();

        return end - start;
    }

    /**
     * Метод измерения времени сортировки коллекции List собственным методом сортировки
     *
     * @param collection коллекция, которую нужно отсортировать
     * @param comparator компаратор, с помощью которого сортируется коллекция
     * @return время сортировки коллекции
     */
    public long sortListByOwnMethodExecutionTime(List<T> collection, Comparator<T> comparator) {
        long start = System.currentTimeMillis();
        handler.sort(collection,comparator);
        long end = System.currentTimeMillis();

        return end - start;
    }

    /**
     * Метод измерения времени сортировки коллекции Set собственным методом сортировки
     *
     * @param collection коллекция, которую нужно отсортировать
     * @param comparator компаратор, с помощью которого сортируется коллекция
     * @return время сортировки коллекции
     */
    public long sortSetByOwnMethodExecutionTime(Set<T> collection, Comparator<T> comparator) {
        long start = System.currentTimeMillis();
        handler.sort(collection,comparator);
        long end = System.currentTimeMillis();

        return end - start;
    }

    /**
     * Метод измерения времени сортировки коллекции List встроенными средствами JDK
     *
     * @param collection коллекция, которую нужно отсортировать
     * @param comparator компаратор, с помощью которого сортируется коллекция
     * @return время сортировки коллекции
     */
    public long sortListByJdkExecutionTime(List<T> collection, Comparator<T> comparator) {
        long start = System.currentTimeMillis();
        collection.sort(comparator);
        long end = System.currentTimeMillis();

        return end - start;
    }

    /**
     * Метод измерения времени сортировки коллекции Set встроенными средствами JDK
     *
     * @param collection коллекция, которую нужно отсортировать
     * @param comparator компаратор, с помощью которого сортируется коллекция
     * @return время сортировки коллекции
     */
    public long sortSetByJdkExecutionTime(Set<T> collection, Comparator<T> comparator) {
        long start = System.currentTimeMillis();

        List<T> list = new ArrayList<>(collection);
        list.sort(comparator);
        LinkedHashSet<T> sortedSet = new LinkedHashSet<>(list);

        long end = System.currentTimeMillis();

        return end - start;
    }

    /**
     * Метод измерения времени итерирования коллекции с помощью итератора
     *
     * @param collection коллекция, которую нужно проитерировать
     * @return время итерирования коллекции
     */
    public long iterationByIteratorExecutionTime(Collection<T> collection) {
        long start = System.currentTimeMillis();
        handler.iterationByIterator(collection);
        long end = System.currentTimeMillis();

        return end - start;
    }

    /**
     * Метод измерения времени итерирования коллекции с помощью цикла for
     *
     * @param collection коллекция, которую нужно проитерировать
     * @return время итерирования коллекции
     */
    public long iterationByForExecutionTime(Collection<T> collection) {
        long start = System.currentTimeMillis();
        handler.iterationByFor(collection);
        long end = System.currentTimeMillis();

        return end - start;
    }

    /**
     * Метод измерения времени удаления всех элементов коллекции с помощью итератора
     *
     * @param collection коллекция, элементы которой нужно удалить
     * @return время удаления
     */
    public long removeAllByIteratorExecutionTime(Collection<T> collection) {
        long start = System.currentTimeMillis();
        handler.removeAllByIterator(collection);
        long end = System.currentTimeMillis();

        return end - start;
    }

    /**
     * Метод измерения времени удаления всех элементов коллекции
     *
     * @param collection коллекция, элементы которой нужно удалить
     * @return время удаления
     */
    public long removeAllExecutionTime(Collection<T> collection) {
        long start = System.currentTimeMillis();
        handler.removeAll(collection);
        long end = System.currentTimeMillis();

        return end - start;
    }
}
