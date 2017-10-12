package src.Lab1_4;

/*
Write a console program that prints result type casting for different primitive types.
 */

public class Lab48 {
    public static void main(String args[]) {

        short s = 12;      // 12 - short
        float f = s;       // short to float
        System.out.println("f=" + f);


        f = 1.23f;
        double d = f;      // float to double
        System.out.println("d=" + d);

        }
}
