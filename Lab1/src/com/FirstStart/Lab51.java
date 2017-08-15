package com.FirstStart;

    class Lab51 {
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            for (int j = 8; j > 0; j--) {
                if (j < i) {
                    System.out.print(j + " ");
                }
            }
            System.out.println(" ");
        }


    }
}