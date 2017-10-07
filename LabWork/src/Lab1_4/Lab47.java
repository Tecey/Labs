package src.Lab1_4;

/*
Write a console program that prints result of Ternary operator for integer variable
initialization.
 */

public class Lab47 {
    public static void main(String args[]) {

        int x=3;
        int y=2;
        int z = x < y ? (x + y) : (x - y);
        System.out.println(z);      // 1 = (x-y)

    }
}
