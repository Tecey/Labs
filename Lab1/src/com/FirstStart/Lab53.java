package com.FirstStart;

/*
Using loops.
 */

public class Lab53 {
    public static void main(String[] args) {

        int[] mas = new int[15];
        for (int i = 2; i <= 30; i = i + 2) {
            mas[i / 2 - 1] = i;
        }
        for (int i = 0; i < 15; i++) {
            System.out.println(mas[i]);
        }
    }
}
