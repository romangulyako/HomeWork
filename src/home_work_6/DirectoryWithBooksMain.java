package home_work_6;

import home_work_6.api.ISearchEngine;
import home_work_6.api.ITextHandler;
import home_work_6.search_engines.RegExSearch;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class DirectoryWithBooksMain {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите путь к папке с книгами: ");
        String path = console.nextLine();
        File[] books = getBooks(path);

        String menu = getGlobalMenu(path);
        System.out.println(menu);

        try (Writer writer = new FileWriter("result.txt")){

            while (true) {
                System.out.println("-----------------------");
                System.out.println(getGlobalMenu(path));
                int indexBook = console.nextInt();

                if (indexBook == 0) {
                    break;
                } else if (indexBook < 0 || indexBook > books.length) {
                    System.out.println("Передан неверный параметр. Повторите!");
                }
                else {
                    String bookName = books[indexBook-1].getName();
                    ITextHandler bookHandler = new BookHandler(path +"/"+ bookName);

                    while (true) {
                        System.out.println("-----------------------");
                        System.out.println(getBookMenu());
                        String menuChoice = console.next();
                        if (menuChoice.equals("1")) {
                            System.out.print("Введите слово для поиска: ");
                            String word = console.next();
                            ISearchEngine searchEngine = new RegExSearch();
                            long countUsage = searchEngine.search(bookHandler.getText(),word);
                            System.out.println("Это слово встречается " + countUsage + " раз");
                            writer.write(books[indexBook-1].getName() + " - " + word + " - " + countUsage + "\n");
                            writer.flush();
                        } else {
                            break;
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static File[] getBooks(String path) {
        File directory = new File(path);

        if (directory.isDirectory()) {
            return directory.listFiles();
        } else {
            throw new IllegalArgumentException("Это не папка или такой папки не существует!");
        }
    }

    public static String getGlobalMenu(String path) {
        StringBuilder menu = new StringBuilder();
        File[] books = getBooks(path);

        int number = 1;
        for (File book : books) {
            menu.append(number++).append(". ").append(book.getName()).append("\n");
        }
        menu.append("0. Выход из программы\n");
        menu.append("Введите номер книги или 0 для выхода из программы: ");

        return menu.toString();
    }

    public static String getBookMenu() {
        return "1 - Найти слово в книге\nДругая клавиша - Вернуться к списку книг\n";
    }
}
