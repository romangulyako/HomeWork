package home_work_6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Menu {
    private final List<MenuItem> items = new ArrayList<>();

    public void addItem(MenuItem item) {
        this.items.add(item);
    }

    public MenuItem getItem(int id) {
        for (MenuItem item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder menuBuilder = new StringBuilder();

        items.sort(Comparator.comparingInt(MenuItem::getId));

        for (MenuItem item : items) {
            menuBuilder.append(item.toString()).append("\n");
        }

        menuBuilder.append("Введите номер нужного пункта: ");

        return menuBuilder.toString();
    }
}
