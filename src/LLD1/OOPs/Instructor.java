package LLD1.OOPs;

import java.util.List;

public class Instructor extends Person{
    List<Student> students;
    public Instructor(int age, String name, List<Student> students) {
        super(age, name);
        this.students = students;
    }
}
