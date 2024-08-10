package home_work_4;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainer<T> {
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
            T[] newData = Arrays.copyOf(data,data.length - 1);

            for (int i = 0; i < index; i++) {
                newData[i] = data[i];
            }

            for (int i = index; i < newData.length; i++) {
                newData[i] = data[i+1];
            }

            data = Arrays.copyOf(newData,newData.length);

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
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i + 1; j < data.length; j++) {
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
}
