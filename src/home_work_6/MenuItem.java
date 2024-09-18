package home_work_6;

public class MenuItem {
    private final String title;
    private final int id;

    public MenuItem(String title, int id) {
        this.title = title;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + ". " + title;
    }
}
