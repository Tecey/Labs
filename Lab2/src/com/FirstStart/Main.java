package com.FirstStart;

public class Main {

    public static void main(String[] args) {
        Computer [] comps = new Computer [5];

        for (int i = 0; i < 5; i++) {
            comps[i] = new Computer();
            comps[i].price = comps[i].price * 1.1f;
            comps[i].view();
        }
    }
}
