package src.Lab1_4;

/*
Write a console program that prints result of Bitwise operators for two integer variables.
 */

public class Lab46 {
    public static void main(String args[]) {

        int a = 3;  // 00000011
        int d = 5;  // 00000101
        System.out.println(a & d);      // 1 = 00000001

        int a1 = 3;  // 00000011
        int d1 = 5;  // 00000101
        System.out.println(a1 | d1);    // 7 = 00000111

        int a2 = 3;  // 00000011
        int d2 = 5;  // 00000101
        int r = a2 ^ d2;
        System.out.println(r);          // 6 = 00000110

        System.out.println(~ d2);       // 00000101 ... -6 = 11111010




    }
}
