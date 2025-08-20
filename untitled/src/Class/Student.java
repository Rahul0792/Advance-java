package Class;

public class Student {
    int id;
    String name;

    public static void main(String [] args){
        Student student = new Student();
        student.id=101;
        student.name="Rahul";
        System.out.println("Name is        "+student.name + "   id is "+ student.id);
    }
}