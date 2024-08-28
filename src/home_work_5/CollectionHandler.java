package home_work_5;

import home_work_5.api.ICreator;
import home_work_5.utils.SortUtils;

import java.util.*;

public class CollectionHandler<T> {

    /**
     * Метод заполняет коллекцию
     *
     * @param collection коллекция, которую нужно заполнить
     * @param countOfElements количество элементов в коллекции
     * @param elementCreator объект для создания элементов коллекции
     */
    public void fillCollection(Collection<T> collection, int countOfElements, ICreator<T> elementCreator) {
        if (countOfElements > 0 && collection != null) {
            Random rnd = new Random();

            for (int i = 0; i < countOfElements; i++) {
                collection.add(elementCreator.create());
            }
        } else {
            throw new IllegalArgumentException("Передали null или неверный размер коллекции!");
        }
    }

    /**
     * Метод сортирует коллекцию, реализующую интерфейс List
     *
     * @param collection коллекция, которую нужно отсортировать
     * @param comparator компаратор, которым сортируем коллекцию
     */
    public void sort(List<T> collection, Comparator<T> comparator) {
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
     * @return отсортированную коллекцию (LinkedHashSet)
     */
    public Set<T> sort(Set<T> collection, Comparator<T> comparator) {
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
     */
    public void iterationByIterator(Collection<T> collection) {
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
     */
    public void iterationByFor(Collection<T> collection) {
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
     */
    public void removeAllByIterator(Collection<T> collection) {
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
     */
    public void removeAll(Collection<T> collection) {
        collection.clear();
    }
}
