package _6_Method.mvc;

public class App {

    public static void main(String[] args) {
        Student student = new Student();

        student.id=101;
        student.salary = 5000;
        student.name = "Rahul";
        StudentController studentController = new StudentController();

        studentController.addStudent(student );
    }
}
