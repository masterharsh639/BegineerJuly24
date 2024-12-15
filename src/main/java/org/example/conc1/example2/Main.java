package org.example.conc1.example2;

public class Main {
    public static void main(String[] args) {
        OddPrinter odd = new OddPrinter();
        EvenPrinter even = new EvenPrinter();

        Thread t1 = new Thread(odd);
        Thread t2 = new Thread(even);

        t1.start();
        t2.start();
    }
}
