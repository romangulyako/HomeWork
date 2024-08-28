package home_work_5.dto;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Person implements Comparable<Person> {
    private final String nick;
    private final String password;
    private final String name;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(nick, person.nick) && Objects.equals(password, person.password) && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nick, password, name);
    }

    @Override
    public String toString() {
        return "{ nick= " + nick + ", passwordLength= " + password.length() + ", name= " + name + " }";
    }

    @Override
    public int compareTo(@NotNull Person o) {
        if (this.password.length() != o.password.length()) {
            return this.password.length() - o.password.length();
        }

        return this.nick.compareTo(o.nick);
    }
}
