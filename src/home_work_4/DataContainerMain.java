package home_work_4;

import home_work_4.comparators.IntegerComparator;
import home_work_4.comparators.StringLengthComparator;

import java.util.Arrays;

public class DataContainerMain {
    public static void main(String[] args) {
        Integer[] arrayOfInteger = new Integer[0];
        Integer[] arrayOfIntegerWithNullElements = {2, 5, 6, 8, 0, null, 5, 6, 89, null, null};
        String[] arrayOfString = new String[0];
        String[] arrayOfStringWithNullElements = {"Илья", "Роман", "Кирилл", null, "Анна","Мария", null, "Евгений", "Максим", "Артем", null, "Михаил"};
        Integer[] emptyArray = new Integer[0];
        Integer[] nullArray = null;

        // Тест заданий 1-10
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

        if (isNotNullInsteadOfArray(emptyArray)) {
            DataContainer<Integer> emptyContainer = new DataContainer<>(emptyArray);

            System.out.println("Пустая коллекция: " + emptyContainer.toString());
        } else {
            System.out.println("Массива нет, Вы передали null!");
        }
        System.out.println("-------------------------------------------");

        if (isNotNullInsteadOfArray(nullArray)) {
            DataContainer<Integer> nullContainer = new DataContainer<>(nullArray);

            System.out.println("Пустая коллекция: " + nullContainer.toString());
        } else {
            System.out.println("Массива нет, Вы передали null!");
        }
        System.out.println("-------------------------------------------");

        // Тест задания 11*
        if (isNotNullInsteadOfArray(arrayOfIntegerWithNullElements)) {
            DataContainer<Integer> containerForStaticSort = new DataContainer<>(arrayOfIntegerWithNullElements);

            System.out.println("Коллекция до сортировки: " + containerForStaticSort.toString());
            DataContainer.sort(containerForStaticSort);

            System.out.println("Коллекция после сортировки: " + containerForStaticSort.toString());
        } else {
            System.out.println("Массива нет, Вы передали null!");
        }
        System.out.println("-------------------------------------------");

        if (isNotNullInsteadOfArray(arrayOfStringWithNullElements)) {
            DataContainer<String> containerForStaticSort = new DataContainer<>(arrayOfStringWithNullElements);

            System.out.println("Коллекция до сортировки: " + containerForStaticSort.toString());
            DataContainer.sort(containerForStaticSort);

            System.out.println("Коллекция после сортировки: " + containerForStaticSort.toString());
        } else {
            System.out.println("Массива нет, Вы передали null!");
        }
        System.out.println("-------------------------------------------");

        // Тест задания 12*
        if (isNotNullInsteadOfArray(arrayOfStringWithNullElements)) {
            DataContainer<String> containerForStaticSort = new DataContainer<>(arrayOfStringWithNullElements);

            System.out.println("Коллекция до сортировки: " + containerForStaticSort.toString());
            DataContainer.sort(containerForStaticSort,new StringLengthComparator());

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
