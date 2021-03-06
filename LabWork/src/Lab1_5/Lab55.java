package src.Lab1_5;

import java.util.Scanner;

/*

Write a program to produce the sum of 1, 2, 3, ..., to an upper bound - n.
Also compute and display the average.
The output shall look like:
The Sum is: 100
The Avg is: 10

Напишите программу для получения суммы 1, 2, 3, ..., в верхнюю границу - n.
Также вычислить и отобразить среднее значение.
Результат должен выглядеть так:
Сумма составляет: 100
Среднее значение: 10
 */

public class Lab55 {
    public static void main(String[] args) {
        System.out.println("Введите любое целое положительное число: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Сумма составляет: " + sum);
        int sot = sum / n;
        System.out.println("Среднее значение: " + sot);
    }
}