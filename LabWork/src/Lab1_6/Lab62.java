package Lab1_6;

/*
Writing simple console application, using array and enhanced loop for typical
operations on arrays (search).
There are statistics for the year by months as an array:
int[] m = new int[] { 10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14 };
Write code which calculates the maximum value from the array, the minimum value
and the average.

Написание простого консольного приложения с использованием массива и расширенного цикла для типичных
операции над массивами (поиск).
Статистика за год по месяцам представлена в виде массива:
int [] m = new int [] {10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14};
Напишите код, который вычисляет максимальное значение из массива, минимальное значение
и в среднем.
 */
public class Lab62 {
    public static void main(String[] args) {

        int[] mas = new int[]{10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14};
        int max = 0;
        int min = 0;
        int ser = 0;

        for (int i = 0; i <= mas.length; i++) {
            if (i > max) {
                i = max;

            } else if (i < min) {
                i = min;
            }

            System.out.println("Максимально " + max);

            System.out.println("Мінімально " + min);

            System.out.println("Середнє " + ser);
        }
    }
}