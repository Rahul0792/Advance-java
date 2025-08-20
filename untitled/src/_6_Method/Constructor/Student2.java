package _6_Method.Constructor;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Setter
@Getter

public class Student2 {
    int id;
    String Name;
    int salary;
    String address;

    public static void main(String[] args) {
        Student2 student = new Student2(1,"Rahul",1000,"Bharadi");
        Student2 student1 = new Student2();

        System.out.println("id  "+student.Name);
        System.out.println("id  "+student.salary);
        System.out.println("id  "+student.address);
        System.out.println("id  "+student.id);
        System.out.println("id  "+student.id);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        System.out.println(student.toString());
        System.out.println(student1.toString());


    }

//    public Student2(int id, String name, int salary, String address) {
//        this.id = id;
//        Name = name;
//        this.salary = salary;
//        this.address = address;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return Name;
//    }
//
//    public int getSalary() {
//        return salary;
//    }
//
//    public String getAddress() {
//        return address;
//    }
}
