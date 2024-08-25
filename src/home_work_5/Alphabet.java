package home_work_5;

public enum Alphabet {
    RU(32,1040,1072),
    EN(26,65,97);

    private final int size;
    private final int startUpperLetter;
    private final int startLowerLetter;

    Alphabet(int size, int startUpperLetter, int startLowerLetter) {
        this.size = size;
        this.startUpperLetter = startUpperLetter;
        this.startLowerLetter = startLowerLetter;
    }

    public int getSize() {
        return size;
    }

    public int getStartUpperLetter() {
        return startUpperLetter;
    }

    public int getStartLowerLetter() {
        return startLowerLetter;
    }
}
