package home_work_6;

import home_work_6.api.ISearchEngine;
import home_work_6.api.ITextHandler;
import home_work_6.search_engines.RegExSearch;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class DirectoryWithBooksMain {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите путь к папке с книгами: ");

        String path = console.nextLine();


        try (Writer writer = new FileWriter("result.txt")){
            while (true) {
                System.out.println(globalMenu());
                int selectGlobalMenu = console.nextInt();

                if (selectGlobalMenu == 0) {
                    break;
                } else if (selectGlobalMenu > 1) {
                    System.out.println("Такого пункта в меню нет. Программа закрывается.");
                } else {
                    while (true) {
                        System.out.println(listBooksMenu(path));
                        int selectListBookMenu = console.nextInt();

                        List<String> books = getBooksNames(path);
                        if (selectListBookMenu == 0) {
                            break;
                        } else if (selectListBookMenu < 0 || selectListBookMenu > books.size()) {
                            System.out.println("Неверный номер книги!");
                        } else {
                            String bookName = books.get(selectListBookMenu-1);
                            ITextHandler bookHandler = new BookHandler(path +"/"+ bookName);

                            while (true) {
                                System.out.println(bookMenu());
                                int selectBookMenu = console.nextInt();
                                if (selectBookMenu == 1) {
                                    System.out.print("Введите слово для поиска: ");
                                    String word = console.next();
                                    ISearchEngine searchEngine = new RegExSearch();

                                    long countUsage = searchEngine.search(bookHandler.getText(),word);
                                    System.out.println("Это слово встречается " + countUsage + " раз");

                                    writer.write(bookName + " - " + word + " - " + countUsage + "\n");
                                    writer.flush();
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        } catch (IOException | InputMismatchException e) {
            System.out.println(e.getMessage());
        }
    }
    public static List<String> getBooksNames(String path) {
        File directory = new File(path);
        List<String> bookNames = new ArrayList<>();

        if (directory.isDirectory()) {
            File[] books = directory.listFiles();

            for (File file : books) {
                bookNames.add(file.getName());
            }

            return bookNames;
        } else {
            throw new IllegalArgumentException("Это не папка или такой папки не существует!");
        }
    }

    public static Menu globalMenu() {
        Menu globalMenu = new Menu();

        globalMenu.addItem(new MenuItem("Перейти к списку книг", 1));
        globalMenu.addItem(new MenuItem("Выйти из программы", 0));

        return globalMenu;
    }

    public static Menu listBooksMenu(String path) {
        Menu listBooksMenu = new Menu();
        List<String> booksNames = getBooksNames(path);
        int id = 1;

        for (String bookName : booksNames) {
            listBooksMenu.addItem(new MenuItem(bookName,id++));
        }

        listBooksMenu.addItem(new MenuItem("Вернуться в основное меню", 0));

        return listBooksMenu;
    }

    public static Menu bookMenu() {
        Menu bookMenu = new Menu();

        bookMenu.addItem(new MenuItem("Найти слово в книге", 1));
        bookMenu.addItem(new MenuItem("Вернуться к списку книг", 0));

        return bookMenu;
    }
}
