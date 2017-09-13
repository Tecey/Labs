package com.FirstStart;

/*
Write a console program that prints result of each of arithmetic logical (AND, OR, NOT,
XOR) for two variables of boolean data type.
 */

public class Lab43 {
    public static void main(String args[]) {

        boolean a = true;
        boolean b = false;

        boolean c = a & b;      // AND
        System.out.println(c);

        boolean v = a | b;      // OR
        System.out.println(v);

        boolean j = a != b;     // NOT
        System.out.println(j);

        boolean r = a ^ b;      // XOR
        System.out.println(r);


    }
}
