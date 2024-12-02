package org.example.oops_1;

public class Student {
    String name;
    int age;
    float psp;

    void changeBatch(){
        System.out.println(name+ "batch changed");
    }

    void joinBatch(){
        System.out.println(name+ "Join changed");
    }

    void printDetails(){
        System.out.println(" Name :" + name);
        System.out.println(" age :" + age);
        System.out.println(" psp :" + psp);
    }
}
