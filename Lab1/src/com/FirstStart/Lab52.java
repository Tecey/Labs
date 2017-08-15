package com.FirstStart;
import java.util.Scanner;
/*
Writing simple console application, using "nested-if" statement, "switch-case"
statement.
 */

public class Lab52 {
    public static void main(String[] args) {

        System.out.print("Введите число 1, 2 или 3: ");
        Scanner inputFigure = new Scanner(System.in);
        int i = inputFigure.nextInt();

        if (i == 1) {
            System.out.println("Вы ввели число 1");
        } else if (i == 2) {
            System.out.println("Вы ввели число 2");
        } else if (i == 3) {
            System.out.println("Вы ввели число 3");
        } else {
            System.out.println("Вы ввели число не равное 1, 2 или 3");


//            System.out.println("Введите 1, 2, 3 или 4");
//            Scanner scan = new Scanner(System.in);
//            int number = scan.nextInt();
//
//            switch (number){
//                case 1: System.out.println ("Вы ввели число 1"); break;
//                case 2: System.out.println ("Вы ввели число 2"); break;
//                case 3: System.out.println ("Вы ввели число 3"); break;
//                case 4: System.out.println ("Вы ввели число 4"); break;
//                default: System.out.println("Вы ввели неправильное число");

        }
    }
}
