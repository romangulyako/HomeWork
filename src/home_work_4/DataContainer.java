package home_work_4;

import home_work_4.iterators.DataContainerIterator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class DataContainer<T>  implements Iterable<T>{
    /**
     * Приватное поле, с которым будет осуществлена работа методов экземпляра класса DataContainer
     */
    private T[] data;

    /**
     * Конструктор класса, в который передается массив определенного типа данных
     *
     * @param data массив данных, с копией которого осуществляется дальнейшая работа
     */
    public DataContainer(T[] data) {
        this.data = Arrays.copyOf(data,data.length);
    }

    /**
     * Метод добавления нового элемента в коллекцию
     *
     * @param item элемент, который необходимо добавить
     * @return индекс элемента в коллекции или -1, если в метод передали null
     */
    public int add(T item) {
        int index = -1;

        if (item != null) {
            boolean isPasted = false;

            for (int i = 0; i < data.length; i++) {
                if (data[i] == null) {
                    data[i] = item;
                    index = i;
                    isPasted = true;
                    break;
                }
            }

            if (!isPasted) {
                data = Arrays.copyOf(data,data.length + 1);
                data[data.length -1] = item;
                index = data.length - 1;
            }
        }

        return index;
    }

    /**
     * Метод возвращает элемент из коллекции по его индексу
     *
     * @param index индекс элемента в коллекции
     * @return элемент коллекции
     */
    public T get(int index) {
        if (index < data.length && index >= 0) {
            return data[index];
        }

        return null;
    }

    /**
     * Метод возвращает массив объектов, которые содержит коллекция
     *
     * @return массив объектов
     */
    public T[] getItems() {
        return data;
    }

    /**
     * Метод удаляет элемент из коллекции по его индексу
     *
     * @param index индекс элемента в коллекции
     * @return true, если передан корректный индекс и удаление произошло. false, если передан некорректный индекс
     */
    public boolean delete(int index) {
        if (index < data.length && index >= 0) {

            for (int i = index; i < data.length - 1; i++) {
                data[i] = data[i + 1];
            }
            data = Arrays.copyOf(data,data.length -1);

            return true;
        }
        return false;
    }

    /**
     * Метод удаляет элемент из коллекции по его значению
     *
     * @param item объект со значением, который нужно удалить
     * @return true при успешном удалении, false если передали null или элемент с таким значением не был найден
     */
    public boolean delete(T item) {
        if (item != null) {
            for (int i = 0; i < data.length; i++) {
             if (data[i].equals(item)) {
                 return delete(i);
             }
            }
        }

        return false;
    }

    /**
     * Метод сортирует коллекцию
     *
     * @param comparator объект класса, реализующего интерфейс Comparator, в котором определено,
     *                   по каким критериям будет происходить сортировка
     */
    public void sort(Comparator<T> comparator) {
        int countOfNullElements = this.moveNullElementToEnd(this);

        for (int i = 0; i < data.length - (1 + countOfNullElements); i++) {
            for (int j = i + 1; j < data.length - countOfNullElements; j++) {
                if (comparator.compare(data[i],data[j]) > 0) {
                    T tmp = data[i];
                    data[i] = data[j];
                    data[j] = tmp;
                }
            }
        }
    }

    /**
     * Метод переопределяет метод toString() класса Object и возвращает коллекцию
     * для печати, пропуская элементы коллекции, которые содержат null
     *
     * @return отформатированную для печати коллекцию без null-элементов
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");

        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                builder.append(data[i].toString());
                if (i < data.length -1) {
                    builder.append(", ");
                }
            }
        }

        if(data.length != 0 && data[data.length -1] == null) {
            builder = new StringBuilder(builder.substring(0, builder.length() - 2));
        }
        builder.append("]");

        return builder.toString();
    }

    /**
     * Статический метод, который сортирует переданную в него коллекцию
     *
     * @param container коллекция, которую необходимо отсортировать
     * @param <T> тип объектов, которые содержит коллекция
     */
    public static <T extends Comparable<T>> void sort(DataContainer<T> container) {
        int countOfNullElements = container.moveNullElementToEnd(container);

        // Сортируем элементы массива пока не пойдут null-элементы
        for (int i = 0; i < container.getItems().length - (countOfNullElements + 1); i++) {
            for (int j = i + 1; j < container.getItems().length - countOfNullElements; j++) {
                if (container.get(i).compareTo(container.get(j)) > 0) {
                    T tmp = container.get(i);
                    container.getItems()[i] = container.get(j);
                    container.getItems()[j] = tmp;
                }
            }
        }
    }

    /**
     * Статический метод, который сортирует коллекцию с помощью определенной реализации интерфейса Comparator
     *
     * @param container коллекция, которую необходимо отсортировать
     * @param comparator реализация интерфейса Comparator
     * @param <T> тип объектов, которые содержит коллекция и которые сравнивает comparator
     */
    public static <T> void sort(DataContainer<T> container, Comparator<T> comparator) {
        container.sort(comparator);
    }

    /**
     * Приватный метод, который перемещает все null-элементы коллекции в конец
     *
     * @param container коллекция, null-элементы которой нужно переместить в конец
     * @return количество null-элементов
     */
    private int moveNullElementToEnd(DataContainer<T> container) {
        // Перемещаем все null-элементы в конец массива
        for (int i = 0; i < container.getItems().length - 1; i++) {
            for (int j = i + 1; j < container.getItems().length; j++) {
                if (container.get(i) == null) {
                    T tmp = container.get(i);
                    container.getItems()[i] = container.get(j);
                    container.getItems()[j] = tmp;
                }
            }
        }

        int countOfNullElements = 0;
        // Считаем сколько в массиве null-полей (для меньшего количества проверок при сортировке)
        for (T item : container.getItems()) {
            if (item == null) {
                countOfNullElements++;
            }
        }
        return countOfNullElements;
    }

    /**
     * Метод возвращает объект типа DataContainerIterator, с помощью которого осуществляется итерирование коллекции
     * @return итератор класса DataContainerIterator, который реализует интерфейс Iterator
     */
    @Override
    public Iterator<T> iterator() {
        return new DataContainerIterator<>(this);
    }
}
