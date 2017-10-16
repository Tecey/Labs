package Lab1_6;

/*
Create an array of all the even numbers from 2 to 30 (2,4,6...30) and display elements of
the array to the screen.


Создайте массив всех четных чисел от 2 до 30 (2,4,6 ... 30) и отобразите элементы
массив на экран.
 Студент должен использовать массив и цикл.
Попросите учащегося выполнить программу
 */

public class Lab61 {
    public static void main(String[] args) {

        int [] array = new int[30/2];

        for (int i = 0, j = 2; i < array.length; i++, j+=2) {
            array[i] = j;
            System.out.print(array[i] + " ");


        }

    }
}
