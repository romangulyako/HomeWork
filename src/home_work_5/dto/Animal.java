package home_work_5.dto;

public class Animal {
    private final byte age;
    private final String nick;

    public Animal(byte age, String nick) {
        if (age >= 1 && age <= 15) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Возраст должен быть от 1 до 15");
        }

        this.nick = nick;
    }

    public byte getAge() {
        return age;
    }

    public String getNick() {
        return nick;
    }
}
