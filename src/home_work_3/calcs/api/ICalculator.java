package home_work_3.calcs.api;

public interface ICalculator {
    /**
     * Метод делит одно число на другое
     *
     * @param x числитель
     * @param y знаменатель
     * @return результат деления x на y
     */
    double divide(double x, double y);

    /**
     * Метод умножает одно число на другое
     *
     * @param x первый множитель
     * @param y второй множитель
     * @return результат умножения x на y
     */
    double multiply(double x, double y);

    /**
     * Метод складывает одно число с другим
     *
     * @param x первое слогаемое
     * @param y второе слогаемое
     * @return результат сложения x и y
     */
    double sum(double x, double y);

    /**
     * Метод отнимает от одного числа другое
     *
     * @param x уменьшаемое
     * @param y вычитаемое
     * @return результат вычитания y из x
     */
    double subtract(double x, double y);

    /**
     * Метод возводит дробное число в степень
     *
     * @param x число, которое нужно возвести
     * @param y степень возведения
     * @return результат возведения числа x в степень y
     */
    double pow(double x, int y);

    /**
     * Метод возвращает модуль числа
     *
     * @param x число, которое нужно вернуть по модулю
     * @return модуль числа x
     */
    int abs(int x);

    /**
     * Метод вычисляет квадратный корень из числа
     *
     * @param x число, из которого нужно вычислить квадратный корень
     * @return квадратный корень числа x
     */
    double sqrt(int x);
}
