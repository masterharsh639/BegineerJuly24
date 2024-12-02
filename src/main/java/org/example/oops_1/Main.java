package org.example.oops_1;

public class Main {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Harsh";
        s1.age=16;
        s1.psp=99;
        s1.joinBatch();
        s1.changeBatch();
        s1.printDetails();
        System.out.println("--------------------------------");
        Student s2=new Student();
        s2.name="Shipra";
        s2.age=12;
        s2.psp=70;

        s2.joinBatch();
        s2.changeBatch();
        s2.printDetails();

    }
}
