package home_work_4;

import home_work_4.comparators.IntegerComparator;
import home_work_4.comparators.StringAlphabeticComparator;
import home_work_4.comparators.StringLengthComparator;

import java.util.Arrays;
import java.util.Iterator;

public class DataContainerMain {
    public static void main(String[] args) {
        Integer[] emptyArrayOfInteger = new Integer[0];
        Integer[] arrayOfIntegerWithNullElements = {2, 5, 6, 8, 0, null, 5, 6, 89, null, null};
        String[] emptyArrayOfString = new String[0];
        String[] arrayOfStringWithNullElements = {"Илья", "Роман", "Кирилл", null, "Анна","Мария", null, "Евгений", "Максим", "Артем", null, "Михаил"};
        Integer[] nullArray = null;

        // Тест заданий 1-10
        if (isNotNullInsteadOfArray(emptyArrayOfInteger)) {
            DataContainer<Integer> container = new DataContainer<>(emptyArrayOfInteger);

            container.add(2);
            container.add(4);
            container.add(1);
            container.add(4);
            container.add(0);
            container.add(6);
            System.out.println("Коллекция после добавления элементов: " + container);

            int indexForDelete = 4;
            if(container.delete(indexForDelete)) {
                System.out.println("Был удален один элемент по индексу " + indexForDelete);
                System.out.println("Коллекция после удаления элемента: " + container);
            }

            Integer element = 9;
            System.out.println("Был добавлен элемент " + element + " по индексу " + container.add(element));
            System.out.println("Коллекция после добавления элемента: " + container);

            container.sort(new IntegerComparator());
            System.out.println("Отсортированная коллекция: " + Arrays.toString(container.getItems()));

            if (container.delete(Integer.valueOf(2))) {
                System.out.println("Был удален один элемент!");
                System.out.println("Коллекция после удаления элемента: " + container);
            }
        } else {
            System.out.println("Массива нет, Вы передали null!");
        }
        System.out.println("-------------------------------------------");

        if (isNotNullInsteadOfArray(emptyArrayOfString)) {
            DataContainer<String> container = new DataContainer<>(emptyArrayOfString);

            container.add("Илья");
            container.add("Роман");
            container.add("Кирилл");
            container.add("Анна");
            container.add("Мария");
            container.add("Евгений");
            container.add("Максим");
            container.add("Артем");
            container.add("Михаил");
            System.out.println("Коллекция после добавления элементов: " + container);

            String element = "Роман";

            if (container.delete(element)) {
                System.out.println("Был удален один элемент!");
                System.out.println("Коллекция после удаления элемента: " + container);
            }

            System.out.println("Добавлен элемент '"+ element + "' с индексом " + container.add(element));
            System.out.println("Коллекция после добавления элемента: " + container);

            container.sort(new StringLengthComparator());
            System.out.println("Отсортированная по длине строки коллекция: " + container);

            System.out.println("Первый элемент в списке: " + container.get(0));

            if(container.delete(4)) {
                System.out.println("Был удален один элемент!");
            }

            System.out.println("Добавлен элемент по индексу " + container.add(element));
        } else {
            System.out.println("Массива нет, Вы передали null!");
        }
        System.out.println("-------------------------------------------");

        if (isNotNullInsteadOfArray(arrayOfIntegerWithNullElements)) {
            DataContainer<Integer> container = new DataContainer<>(arrayOfIntegerWithNullElements);

            System.out.println("Коллекция до вставки элемента: " + Arrays.toString(container.getItems()));

            Integer element = 6;
            System.out.println("Добавлен элемент " + element + " по индексу " + container.add(element));
            System.out.println("Коллекция после вставки элемента: " + Arrays.toString(container.getItems()));

            System.out.println("Коллекция без null-элементов" + container);
        } else {
            System.out.println("Массива нет, Вы передали null!");
        }
        System.out.println("-------------------------------------------");

        if (isNotNullInsteadOfArray(arrayOfStringWithNullElements)) {
            DataContainer<String> container = new DataContainer<>(arrayOfStringWithNullElements);

            System.out.println("Коллекция до вставки элемента: " + Arrays.toString(container.getItems()));

            String element = "Афанасий";
            System.out.println("Добавлен элемент '" + element + "' по индексу " + container.add(element));
            System.out.println("Коллекция после вставки элемента: " + Arrays.toString(container.getItems()));

            System.out.println("Коллекция без null-элементов");

            container.sort(new StringAlphabeticComparator());
            System.out.println("Отсортированная по алфавиту коллекция: " + container);
        } else {
            System.out.println("Массива нет, Вы передали null!");
        }
        System.out.println("-------------------------------------------");

        if (isNotNullInsteadOfArray(emptyArrayOfInteger)) {
            DataContainer<Integer> container = new DataContainer<>(emptyArrayOfInteger);

            System.out.println("Пустая коллекция: " + container);
        } else {
            System.out.println("Массива нет, Вы передали null!");
        }
        System.out.println("-------------------------------------------");

        if (isNotNullInsteadOfArray(nullArray)) {
            DataContainer<Integer> container = new DataContainer<>(nullArray);

            System.out.println("Пустая коллекция: " + container);
        } else {
            System.out.println("Массива нет, Вы передали null!");
        }
        System.out.println("-------------------------------------------");

        // Тест задания 11*
        if (isNotNullInsteadOfArray(arrayOfIntegerWithNullElements)) {
            DataContainer<Integer> container = new DataContainer<>(arrayOfIntegerWithNullElements);

            System.out.println("Коллекция до сортировки: " + container);
            DataContainer.sort(container);
            System.out.println("Коллекция после сортировки: " + container);
        } else {
            System.out.println("Массива нет, Вы передали null!");
        }

        System.out.println("-------------------------------------------");

        // Тест задания 12*
        if (isNotNullInsteadOfArray(arrayOfStringWithNullElements)) {
            DataContainer<String> container = new DataContainer<>(arrayOfStringWithNullElements);

            System.out.println("Коллекция до сортировки: " + container);
            DataContainer.sort(container,new StringLengthComparator());
            System.out.println("Коллекция после сортировки: " + container);
        } else {
            System.out.println("Массива нет, Вы передали null!");
        }
        System.out.println("-------------------------------------------");

        // Тест задания 13**
        if (isNotNullInsteadOfArray(arrayOfStringWithNullElements)) {
            DataContainer<Integer> container = new DataContainer<>(arrayOfIntegerWithNullElements);
            StringBuilder builder = new StringBuilder();

            // Проверка реализации интерфейса Iterable. Без нее цикл foreach не работал бы.
            for (Integer item : container) {
                builder.append(item).append(" ");
            }

            System.out.println(builder.toString().trim());
        } else {
            System.out.println("Массива нет, Вы передали null!");
        }
        System.out.println("-------------------------------------------");

        if (isNotNullInsteadOfArray(arrayOfStringWithNullElements)) {
            DataContainer<String> container = new DataContainer<>(arrayOfStringWithNullElements);
            StringBuilder builder = new StringBuilder();
            Iterator<String> iterator = container.iterator();

            // Проверка реализации методов интерфейса Iterator
            while (iterator.hasNext()) {
                builder.append(iterator.next()).append(" ");
            }

            System.out.println(builder.toString().trim());

            iterator = container.iterator();
            builder = new StringBuilder();

            while (iterator.hasNext()) {
                String str = iterator.next();

                if (str != null && str.equals("Роман")) {
                    iterator.remove();
                } else {
                    builder.append(str).append(" ");
                }
            }

            System.out.println(builder.toString().trim());
        } else {
            System.out.println("Массива нет, Вы передали null!");
        }
        System.out.println("-------------------------------------------");
    }

    public static <T> boolean isNotNullInsteadOfArray(T[] array) {
        return array != null;
    }
}
