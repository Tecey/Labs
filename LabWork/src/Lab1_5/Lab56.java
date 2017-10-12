package src.Lab1_5;

import java.util.Scanner;

/*
Write a program that calculates and displays the sum of squares of digits of number
Student should enter the number using the Scanner
• Student should use loop and arithmetic operators.

Напишите программу, которая вычисляет и отображает сумму квадратов цифр числа
Студент должен ввести номер с помощью сканера
• Студент должен использовать операторы цикла и арифметики.
 */

public class Lab56 {
    public static void main(String[] args) {
        System.out.print("Введите число ... ");
        Scanner inputFigure = new Scanner(System.in);
        int b = inputFigure.nextInt();

        int x = b;
        int s;

        s = (x % 10) * (x % 10);
        // System.out.println("S " + s);
        x = (x / 10) * (x / 10);
        // System.out.println("X " + x);
        int s2 = s + x;
        
        System.out.println("Вы ввели число " + b + ", сумма квадратов цифр = " + s2);
        }



    }