package home_work_2.loops;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println(printMultipliedTable(2,9, 4));
    }

    /*Метод принимает начало и конец диапазона чисел, для которых формируется для печати строка с таблицей умножения,
    * а также количество подтаблиц/столбиков (таблиц умножения для одного числа) в одной строке и возвращает всю табицу*/
    public static String printMultipliedTable(int startNumber, int endNumber, int columnsInRow) {
        StringBuilder builder = new StringBuilder();
        int columnsCounter = 0;                                                         // счетчик для подмчета заполненных подтаблиц(столбиков) для одного числа
        boolean isNewRowOfBlocks = true;                                                // флаг, указывающий, что ряд подтаблиц(столбиков) завершен и нужно начинать новый
        int tmpNumber = 0;                                                              // временная переменная, в которую записываем число, с которого начинается ряд
        int factor = 1;                                                                 // множитель для каждого числа. Будет увеличиваться до 10.
        int subTablesLeft = endNumber - startNumber + 1;                                // количество всех подтаблиц(столбиков)

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
