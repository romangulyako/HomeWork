package home_work_5.utils;

import home_work_5.api.ICreator;
import home_work_5.CollectionHandler;

import java.util.*;

// Класс написан только для того, чтобы не делать здоровенный main и не дублировать код для тестирования программы для объектов класса Person и объектов класса Animal
public class GeneralTestUtils<T> { ;
    private List<T> arrayList;
    private List<T> linkedList;
    private Set<T> hashSet;
    private Set<T> treeSet;

    private final TimeTestUtils<T> timeTest;
    private final Comparator<T> comparator;

    public GeneralTestUtils(CollectionHandler<T> handler, Comparator<T> comparator) {
        this.arrayList = new ArrayList<>();
        this.linkedList = new LinkedList<>();
        this.hashSet = new HashSet<>();
        this.treeSet = new TreeSet<>(comparator);

        this.timeTest = new TimeTestUtils<>(handler);
        this.comparator = comparator;
    }

    public void clearAllCollections() {
        arrayList.clear();
        linkedList.clear();
        hashSet.clear();
        treeSet.clear();
    }

    public void fillingTest(int collectionSize, ICreator<T> elementCreator) {
        System.out.println("ТЕСТИРОВАНИЕ ЗАПОЛНЕНИЯ КОЛЛЕКЦИЙ");
        System.out.println("Операция заполнения ArrayList заняла " + timeTest.fillingCollectionExecutionTime(arrayList,collectionSize,elementCreator) + " мс");
        System.out.println("Операция заполнения LinkedList заняла " + timeTest.fillingCollectionExecutionTime(linkedList,collectionSize,elementCreator) + " мс");
        System.out.println("Операция заполнения HashSet заняла " + timeTest.fillingCollectionExecutionTime(hashSet,collectionSize,elementCreator) + " мс");
        System.out.println("Операция заполнения TreeSet заняла " + timeTest.fillingCollectionExecutionTime(treeSet,collectionSize,elementCreator) + " мс");
        System.out.println("____________________________________________________________________");
    }

    public void sortingByJdkTest() {
        ArrayList<T> copyArrayList = new ArrayList<>(arrayList);
        LinkedList<T> copyLinkedList = new LinkedList<>(linkedList);
        HashSet<T> copyHashSet = new HashSet<>(hashSet);
        TreeSet<T> copyTreeSet = new TreeSet<>(treeSet);

        System.out.println("ТЕСТИРОВАНИЕ СОРТИРОВКИ КОЛЛЕКЦИЙ ВСТРОЕННЫМИ СРЕДСТВАМИ JDK");
        System.out.println("Операция сортировки ArrayList заняла " + timeTest.sortListByJdkExecutionTime(copyArrayList,comparator) + " мс");
        System.out.println("Операция сортировки LinkedList заняла " + timeTest.sortListByJdkExecutionTime(copyLinkedList,comparator) + " мс");
        System.out.println("Операция сортировки HashSet заняла " + timeTest.sortSetByJdkExecutionTime(copyHashSet,comparator) + " мс");
        System.out.println("Операция сортировки TreeSet заняла " + timeTest.sortSetByJdkExecutionTime(copyTreeSet,comparator) + " мс");
        System.out.println("____________________________________________________________________");
    }

    public void sortingByCollectionHandlerTest() {
        ArrayList<T> copyArrayList = new ArrayList<>(arrayList);
        LinkedList<T> copyLinkedList = new LinkedList<>(linkedList);
        HashSet<T> copyHashSet = new HashSet<>(hashSet);
        TreeSet<T> copyTreeSet = new TreeSet<>(treeSet);


        System.out.println("ТЕСТИРОВАНИЕ СОРТИРОВКИ КОЛЛЕКЦИЙ СОБСТВЕННЫМ МЕТОДОМ");
        System.out.println("Операция сортировки ArrayList заняла " + timeTest.sortListByOwnMethodExecutionTime(copyArrayList,comparator) + " мс");
        System.out.println("Операция сортировки LinkedList заняла " + timeTest.sortListByOwnMethodExecutionTime(copyLinkedList,comparator) + " мс");
        System.out.println("Операция сортировки HashSet заняла " + timeTest.sortSetByOwnMethodExecutionTime(copyHashSet,comparator) + " мс");
        System.out.println("Операция сортировки TreeSet заняла " + timeTest.sortSetByOwnMethodExecutionTime(copyTreeSet,comparator) + " мс");
        System.out.println("____________________________________________________________________");
    }

    public void iterationByIteratorTest() {
        System.out.println("ТЕСТИРОВАНИЕ ИТЕРИРОВАНИЯ КОЛЛЕКЦИЙ С ПОМОЩЬЮ Iterator");
        System.out.println("Операция итерирования ArrayList заняла " + timeTest.iterationByIteratorExecutionTime(arrayList) + " мс");
        System.out.println("Операция итерирования LinkedList заняла " + timeTest.iterationByIteratorExecutionTime(linkedList) + " мс");
        System.out.println("Операция итерирования HashSet заняла " + timeTest.iterationByIteratorExecutionTime(hashSet) + " мс");
        System.out.println("Операция итерирования TreeSet заняла " + timeTest.iterationByIteratorExecutionTime(treeSet) + " мс");
        System.out.println("____________________________________________________________________");
    }

    public void iterationByForTest() {
        System.out.println("ТЕСТИРОВАНИЕ ИТЕРИРОВАНИЯ КОЛЛЕКЦИЙ С ПОМОЩЬЮ For");
        System.out.println("Операция итерирования ArrayList заняла " + timeTest.iterationByForExecutionTime(arrayList) + " мс");
        System.out.println("Операция итерирования LinkedList заняла " + timeTest.iterationByForExecutionTime(linkedList) + " мс");
        System.out.println("Операция итерирования HashSet заняла " + timeTest.iterationByForExecutionTime(hashSet) + " мс");
        System.out.println("Операция итерирования TreeSet заняла " + timeTest.iterationByForExecutionTime(treeSet) + " мс");
        System.out.println("____________________________________________________________________");
    }

    public void removeAllWithIteratorTest() {
        ArrayList<T> copyArrayList = new ArrayList<>(arrayList);
        LinkedList<T> copyLinkedList = new LinkedList<>(linkedList);
        HashSet<T> copyHashSet = new HashSet<>(hashSet);
        TreeSet<T> copyTreeSet = new TreeSet<>(treeSet);

        System.out.println("ТЕСТИРОВАНИЕ УДАЛЕНИЯ ЭЛЕМЕНТОВ КОЛЛЕКЦИЙ С ПОМОЩЬЮ Iterator");
        System.out.println("Операция удаления из ArrayList заняла " + timeTest.removeAllByIteratorExecutionTime(copyArrayList) + " мс");
        System.out.println("Операция удаления из LinkedList заняла " + timeTest.removeAllByIteratorExecutionTime(copyLinkedList) + " мс");
        System.out.println("Операция удаления из HashSet заняла " + timeTest.removeAllByIteratorExecutionTime(copyHashSet) + " мс");
        System.out.println("Операция удаления из TreeSet заняла " + timeTest.removeAllByIteratorExecutionTime(copyTreeSet) + " мс");
        System.out.println("____________________________________________________________________");
    }

    public void removeAllTest() {
        ArrayList<T> copyArrayList = new ArrayList<>(arrayList);
        LinkedList<T> copyLinkedList = new LinkedList<>(linkedList);
        HashSet<T> copyHashSet = new HashSet<>(hashSet);
        TreeSet<T> copyTreeSet = new TreeSet<>(treeSet);

        System.out.println("ТЕСТИРОВАНИЕ УДАЛЕНИЯ ЭЛЕМЕНТОВ КОЛЛЕКЦИЙ");
        System.out.println("Операция удаления из ArrayList заняла " + timeTest.removeAllExecutionTime(copyArrayList) + " мс");
        System.out.println("Операция удаления из LinkedList заняла " + timeTest.removeAllExecutionTime(copyLinkedList) + " мс");
        System.out.println("Операция удаления из HashSet заняла " + timeTest.removeAllExecutionTime(copyHashSet) + " мс");
        System.out.println("Операция удаления из TreeSet заняла " + timeTest.removeAllExecutionTime(copyTreeSet) + " мс");
        System.out.println("____________________________________________________________________");
    }
}
