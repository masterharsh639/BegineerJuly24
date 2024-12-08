package org.example.oops_4.interfaces;

public class Dog implements Animal {

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void run() {
        System.out.println("Dog is running");
    }

    @Override
    public void walk() {
        System.out.println("Dog is Walking");
    }
}
