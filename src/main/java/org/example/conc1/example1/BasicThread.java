package org.example.conc1.example1;

public class BasicThread implements Runnable{

    @Override
    public void run() {
        System.out.println("I am in the new thread " + Thread.currentThread().getName());
    }
}
