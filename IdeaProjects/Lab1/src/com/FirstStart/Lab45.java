package com.FirstStart;

/*
Why not 5 ?
 */

public class Lab45 {
    public static void main(String args[]) {

        int a = 10;

        int b = a << 1;
        System.out.println(b);

        int b2 = (a/2)*2 << 1;  // Why not 5 ?
        System.out.println(b2);

        int c = a >> 1;
        System.out.println(c);

        int d = a >>> 1;
        System.out.println(d);

        int w = a >> -1;
        System.out.println(w);
    }
}