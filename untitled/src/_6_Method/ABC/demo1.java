package _6_Method.ABC;

public class demo1 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setId(101);
        student.setName("Rahul");
        System.out.println("Id = "+ student.getId() + " Name " + student.getName());
    }
}

class Student {
    int id;
    String name;

    public void setId(int id) {
        this.id= id;
    }
    public void setName(String Name) {
        this.name = Name;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}

