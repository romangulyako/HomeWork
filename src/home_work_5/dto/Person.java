package home_work_5.dto;

public class Person {
    private String nick;
    private String password;
    private String name;

    public Person(String nick, String password, String name) {
        this.nick = nick;
        if (password.length() >= 5 && password.length() <= 10) {
            this.password = password;
        } else {
            throw new IllegalArgumentException("Пароль должен быть длиной от 5 до 10 символов");
        }

        this.name = name;
    }

    public String getNick() {
        return nick;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }
}
