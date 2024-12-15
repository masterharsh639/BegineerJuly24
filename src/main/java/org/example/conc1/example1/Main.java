package org.example.conc1.example1;

public class Main {
    public static void main(String[] args) {
        BasicThread bs = new BasicThread();
        Thread t = new Thread(bs);
        bs.run();
    }
}
