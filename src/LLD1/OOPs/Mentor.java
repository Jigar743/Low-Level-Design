package LLD1.OOPs;

import java.util.ArrayList;
import java.util.List;

public class Mentor extends Person{
    List<Student> students;
    public Mentor(int age, String name, List<Student> students) {
        super(age, name);
        this.students = students;
    }
}
