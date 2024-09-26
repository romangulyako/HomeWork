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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DirectoryWithBooksThreadedMain {
    public static void main(String[] args) {
        String resultFilePath = "result.txt";
        Scanner console = new Scanner(System.in);
        System.out.print("Введите путь к папке с книгами: ");

        String path = console.nextLine();

        try (Writer writer = new FileWriter(resultFilePath)){
            List<String> books = getBooksNames(path);
            StringBuffer buffer = new StringBuffer();

            while (true) {
                System.out.println(bookMenu());
                int selectMenu = console.nextInt();

                if (selectMenu == 0) {
                    break;
                } else if (selectMenu > 1) {
                    System.out.println("Такого пункта в меню нет. Повторите ввод.");
                } else {
                    System.out.print("Введите слово для поиска: ");
                    String word = console.next();
                    ISearchEngine searchEngine = new RegExSearch();

                    ExecutorService executorService = Executors.newFixedThreadPool(books.size());

                    for (String book : books) {
                        executorService.submit(() -> {
                            ITextHandler bookHandler = new BookHandler(path +"/"+ book);
                            String text = bookHandler.getText();
                            long countUsage = searchEngine.search(text,word);
                            buffer.append(book).append(" - ").append(word).append(" - ").append(countUsage).append("\n");
                        });
                    }

                    executorService.shutdown();
                }
            }

            writer.write(buffer.toString());
            writer.flush();

            System.out.println(new BookHandler(resultFilePath).getText());
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

    public static Menu bookMenu() {
        Menu bookMenu = new Menu();

        bookMenu.addItem(new MenuItem("Найти слово в книге", 1));
        bookMenu.addItem(new MenuItem("Выйти из программы", 0));

        return bookMenu;
    }
}
