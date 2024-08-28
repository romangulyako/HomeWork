package home_work_5.dto;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Animal implements Comparable<Animal> {
    private final int age;
    private final String nick;

    public Animal(int age, String nick) {
        if (age >= 1 && age <= 15) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Возраст должен быть от 1 до 15");
        }

        this.nick = nick;
    }

    public int getAge() {
        return age;
    }

    public String getNick() {
        return nick;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(nick, animal.nick);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, nick);
    }

    @Override
    public String toString() {
        return "{ age = " + age + ", nick='" + nick + "}";
    }

    @Override
    public int compareTo(@NotNull Animal o) {
        if (this.age != o.age) {
            return this.age - o.age;
        }

        return this.nick.compareTo(o.nick);
    }
}
