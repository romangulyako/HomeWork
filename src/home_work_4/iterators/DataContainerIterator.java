package home_work_4.iterators;

import home_work_4.DataContainer;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Класс, реализующий интерфейс Iterator для коллекции DataContainer
 *
 * @param <T> тип объектов коллекции, которую необходимо итерировать
 */
public class DataContainerIterator<T> implements Iterator<T> {
    /**
     * Индекс текущего элемента итерируемой коллекции
     */
    private int index = -1;
    /**
     * Коллекция DataContainer, с которой будут выполнятся методы класса
     */
    private final DataContainer<T> container;

    /**
     * Конструктор класса, который инициализирует поле container переданной в него коллекцией
     * @param container коллекция, которую необходимо итерировать
     */
    public DataContainerIterator(DataContainer<T> container) {
        this.container = container;
    }

    /**
     * Метод указывает, остались ли в коллекции еще элементы
     *
     * @return true, если в коллекции еще есть элементы, false, если элементов в коллекции больше нет
     */
    @Override
    public boolean hasNext() {
        return (index + 1) < container.getItems().length;
    }

    /**
     * Метод возвращает текущий элемент коллекции
     *
     * @return текущий элемент коллекции
     */
    @Override
    public T next() {
        index++;
        if (index >= 0 && index < container.getItems().length) {
            return (T)container.get(index);
        } else {
            throw new NoSuchElementException();
        }
    }

    /**
     * Метод удаляет текущий элемент коллекции
     */
    @Override
    public void remove(){
        container.delete(index--);
    }
}
