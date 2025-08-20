package _6_Method.Constructor;

public class Student {
    int id;
    int salary;
    String name;
    Student(int id, int salary,String name){
            this.id = id;
            this.salary = salary;
            this.name=name;
    }
    void student(){

        System.out.println("Added student  successfully");
    }
    Student(int id, int salary){
        this.id = id;
        this.salary = salary;
        System.out.println("Another Constructor");
    }



    public Student() {
        System.out.println("Default Another Constructor");

    }

    void m1(){
        System.out.println("Added  m1 successfully");
    }
}
