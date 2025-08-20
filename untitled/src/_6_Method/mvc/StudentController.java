package _6_Method.mvc;

public class StudentController {

    public void addStudent(Student student){
         StudentService studentService = new StudentService();
          studentService.addStudent(student);
    }

}
