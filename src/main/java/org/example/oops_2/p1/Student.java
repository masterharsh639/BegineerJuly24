package org.example.oops_2.p1;

public class Student {
    private String name;
    private int age;
    float psp;

    void changeBatch(){
        System.out.println(name+ "batch changed");
    }

    void joinBatch(){
        System.out.println(name+ "Join changed");
    }

   private void printDetails(){
        System.out.println(" Name :" + name);
        System.out.println(" age :" + age);
        System.out.println(" psp :" + psp);
    }
}
