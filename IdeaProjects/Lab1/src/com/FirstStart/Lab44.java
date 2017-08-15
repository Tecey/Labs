package com.FirstStart;

/*
Write a console program that prints result of increment and decrement in prefix and
postfix mode for integer variable.
 */

public class Lab44 {
    public static void main(String args[]) {
        int a = 5;
        a++;
        System.out.println(a);

        int c = a - ++a;
        System.out.println(c);

        int q = 5;
        q--;
        System.out.println(q);

    }
}
