package _6_Method.Constructor;

import javax.xml.namespace.QName;

public class demo1 {
    public static void main(String[] args) {
        Student student = new Student(101,5000,"Rahul");

        System.out.println("id "+ student.id);
        System.out.println("id "+ student.salary);
        System.out.println("id "+ student.name);


        Student student2 = new Student(101,5000);
        System.out.println("id "+ student2.id);
        System.out.println("id "+ student2.salary);
        System.out.println("id "+ student2.name);

        Student student3 = new Student();
        System.out.println("id "+ student3.id);
        System.out.println("id "+ student3.salary);
        System.out.println("id "+ student3.name);



        student.student();
        student.m1();
    }
}
