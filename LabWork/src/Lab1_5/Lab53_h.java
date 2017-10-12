package src.Lab1_5;

/*

Using loops.

 */

public class Lab53_h {
    public static void main(String[] args) {
        int i, j, a = 0;

        for (i = 1; i < 10; i++) {
            for (j = 1; j < 10; j++) {
                a = i * j;
                System.out.print(a + " | ");
            }
            System.out.println();

//        int[] mas = new int[15];
//        for (int i = 2; i <= 30; i = i + 2) {
//            mas[i / 2 - 1] = i;
//        }
//        for (int i = 0; i < 15; i++) {
//            System.out.println(mas[i]);
        }
    }
}
