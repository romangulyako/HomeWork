package home_work_2.loops;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println(printMultipliedTable(2,9));
    }

    public static String printMultipliedTable(int startNumber, int endNumber) {         // передаем начало и конец диапазона чисел, для которых формировать таблицу умножения
        StringBuilder builder = new StringBuilder();
        int columnsCounter = 0;                                                         // счетчик для подмчета заполненных подтаблиц для одного числа
        boolean isNewRowOfBlocks = true;                                                // флаг, указывающий, что ряд подтаблиц завершен и нужно начинать новый
        int tmpNumber = 0;                                                              // временная переменная, в которую записываем число, с которого начинается ряд
        int factor = 1;                                                                 // множитель для каждого числа. Будет увеличиваться до 10.
        int columnsInRow = 4;                                                           // Количество подтаблиц в одном ряду
        int subTablesLeft = endNumber - startNumber + 1;                                // количество всех подтаблиц

        for (int i = startNumber; i <= endNumber ; i++) {
            if(isNewRowOfBlocks) {
                tmpNumber = i;
            }

            String row = i + "\t*\t" + factor + "\t=\t" + i*factor;
            builder.append(row);
            columnsCounter++;

            if(columnsCounter < columnsInRow) {
                builder.append("\t\t");
                isNewRowOfBlocks = false;
            } else {
                if(factor < 10) {
                    i = tmpNumber - 1;                                                  // для новой строки подтаблиц число нужно сбросить к первому из 4-х в строке
                    factor++;                                                           // увеличиваем множитель на 1
                    columnsCounter = 0;                                                 // обнуляем счетчик столбцов
                    builder.append("\n");
                } else {
                    factor = 1;                                                         // если закончили всю подтаблицу, то сбрасываем все счетчики и начинаем новый ряд подтаблиц
                    columnsCounter = 0;
                    isNewRowOfBlocks = true;
                    builder.append("\n\n");
                    subTablesLeft -= columnsInRow;                                      // считаем сколько еще подтаблиц осталось
                    if(subTablesLeft < columnsInRow) {                                  // если осталось меньше 4-х подтаблиц, то формируем ряд подтаблиц из оставшегося их количества
                        columnsInRow = subTablesLeft;
                    }
                }

            }
        }


        return builder.toString();
    }
}
