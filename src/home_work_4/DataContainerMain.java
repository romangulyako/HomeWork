package home_work_4;

import home_work_4.comparators.IntegerComparator;
import home_work_4.comparators.StringLengthComparator;

import java.util.Arrays;

public class DataContainerMain {
    public static void main(String[] args) {
        Integer[] arrayOfInteger = new Integer[0];

        if (isNotNullInsteadOfArray(arrayOfInteger)) {
            DataContainer<Integer> intContainer = new DataContainer<>(arrayOfInteger);

            intContainer.add(2);
            intContainer.add(4);
            intContainer.add(1);
            intContainer.add(4);
            intContainer.add(0);
            intContainer.add(6);
            System.out.println("Коллекция после добавления элементов: " + Arrays.toString(intContainer.getItems()));

            int indexForDelete = 4;
            if(intContainer.delete(indexForDelete)) {
                System.out.println("Был удален один элемент по индексу " + indexForDelete);
                System.out.println("Коллекция после удаления элемента: " + Arrays.toString(intContainer.getItems()));
            }

            Integer element = 9;
            System.out.println("Был добавлен элемент " + element + " по индексу " + intContainer.add(element));
            System.out.println("Коллекция после добавления элемента: " + Arrays.toString(intContainer.getItems()));

            intContainer.sort(new IntegerComparator());
            System.out.println("Отсортированная коллекция: " + Arrays.toString(intContainer.getItems()));

            if (intContainer.delete(Integer.valueOf(2))) {
                System.out.println("Был удален один элемент!");
                System.out.println("Коллекция после удаления элемента: " + Arrays.toString(intContainer.getItems()));
            }
        } else {
            System.out.println("Массива нет, Вы передали null!");
        }
        System.out.println("-------------------------------------------");

        String[] arrayOfString = new String[0];

        if (isNotNullInsteadOfArray(arrayOfString)) {
            DataContainer<String> stringContainer = new DataContainer<>(arrayOfString);

            stringContainer.add("Илья");
            stringContainer.add("Роман");
            stringContainer.add("Кирилл");
            stringContainer.add("Анна");
            stringContainer.add("Мария");
            stringContainer.add("Евгений");
            stringContainer.add("Максим");
            stringContainer.add("Артем");
            stringContainer.add("Михаил");
            System.out.println("Коллекция после добавления элементов: " + Arrays.toString(stringContainer.getItems()));

            String element = "Роман";

            if (stringContainer.delete(element)) {
                System.out.println("Был удален один элемент!");
                System.out.println("Коллекция после удаления элемента: " + Arrays.toString(stringContainer.getItems()));
            }

            System.out.println("Добавлен элемент '"+ element + "' с индексом " + stringContainer.add(element));
            System.out.println("Коллекция после добавления элемента: " + Arrays.toString(stringContainer.getItems()));

            stringContainer.sort(new StringLengthComparator());
            System.out.println("Отсортированная по длине строки коллекция: " + Arrays.toString(stringContainer.getItems()));

            System.out.println("Первый элемент в списке: " + stringContainer.get(0));

            if(stringContainer.delete(4)) {
                System.out.println("Был удален один элемент!");
            }

            System.out.println("Добавлен элемент по индексу " + stringContainer.add(element));
        } else {
            System.out.println("Массива нет, Вы передали null!");
        }
        System.out.println("-------------------------------------------");

        Integer[] arrayOfIntegerWithNullElements = {2, 5, 6, 8, 0, null, 5, 6, 89, null, null};

        if (isNotNullInsteadOfArray(arrayOfIntegerWithNullElements)) {
            DataContainer<Integer> intContainer = new DataContainer<>(arrayOfIntegerWithNullElements);

            System.out.println("Коллекция до вставки элемента: " + Arrays.toString(intContainer.getItems()));

            Integer element = 6;
            System.out.println("Добавлен элемент " + element + " по индексу " + intContainer.add(element));
            System.out.println("Коллекция после вставки элемента: " + Arrays.toString(intContainer.getItems()));

            System.out.println("Коллекция без null-элементов" + intContainer.toString());
        } else {
            System.out.println("Массива нет, Вы передали null!");
        }
        System.out.println("-------------------------------------------");

        String[] arrayOfStringWithNullElements = {"Илья", "Роман", "Кирилл", null, "Анна","Мария", null, "Евгений", "Максим", "Артем", null, "Михаил"};

        if (isNotNullInsteadOfArray(arrayOfStringWithNullElements)) {
            DataContainer<String> stringContainer = new DataContainer<>(arrayOfStringWithNullElements);

            System.out.println("Коллекция до вставки элемента: " + Arrays.toString(stringContainer.getItems()));

            String element = "Афанасий";
            System.out.println("Добавлен элемент '" + element + "' по индексу " + stringContainer.add(element));
            System.out.println("Коллекция после вставки элемента: " + Arrays.toString(stringContainer.getItems()));

            System.out.println("Коллекция без null-элементов" + stringContainer.toString());

            stringContainer.sort(new StringLengthComparator());
            System.out.println("Отсортированная коллекция: " + stringContainer.toString());
        } else {
            System.out.println("Массива нет, Вы передали null!");
        }
        System.out.println("-------------------------------------------");

        Integer[] emptyArray = new Integer[0];
        if (isNotNullInsteadOfArray(emptyArray)) {
            DataContainer<Integer> emptyContainer = new DataContainer<>(emptyArray);

            System.out.println("Пустая коллекция: " + emptyContainer.toString());
        } else {
            System.out.println("Массива нет, Вы передали null!");
        }
        System.out.println("-------------------------------------------");

        Integer[] nullArray = null;
        if (isNotNullInsteadOfArray(nullArray)) {
            DataContainer<Integer> nullContainer = new DataContainer<>(nullArray);

            System.out.println("Пустая коллекция: " + nullContainer.toString());
        } else {
            System.out.println("Массива нет, Вы передали null!");
        }
        System.out.println("-------------------------------------------");

        Integer[] intArrayForSort = {2,56,null,9,2,8,4,null,28,65};

        if (isNotNullInsteadOfArray(intArrayForSort)) {
            DataContainer<Integer> containerForStaticSort = new DataContainer<>(intArrayForSort);

            System.out.println("Коллекция до сортировки: " + containerForStaticSort.toString());
            DataContainer.sort(containerForStaticSort);

            System.out.println("Коллекция после сортировки: " + containerForStaticSort.toString());
        } else {
            System.out.println("Массива нет, Вы передали null!");
        }
        System.out.println("-------------------------------------------");

        String[] stringArrayForSort = {"Илья", "Роман", "Кирилл", null, "Анна","Мария", null, "Евгений", "Максим", "Артем", null, "Михаил"};

        if (isNotNullInsteadOfArray(stringArrayForSort)) {
            DataContainer<String> containerForStaticSort = new DataContainer<>(stringArrayForSort);

            System.out.println("Коллекция до сортировки: " + containerForStaticSort.toString());
            DataContainer.sort(containerForStaticSort);

            System.out.println("Коллекция после сортировки: " + containerForStaticSort.toString());
        } else {
            System.out.println("Массива нет, Вы передали null!");
        }
        System.out.println("-------------------------------------------");

    }

    public static <T> boolean isNotNullInsteadOfArray(T[] array) {
        return array != null;
    }
}
