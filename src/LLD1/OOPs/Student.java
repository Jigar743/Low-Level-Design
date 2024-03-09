package LLD1.OOPs;

public class Student extends Person{
    String batchName;
    double PSP;
    StudentStatus status;

    public Student(int age, String name, String batchName, double psp){
        super(age, name);
        this.batchName = batchName;
        this.PSP = psp;
        this.status = StudentStatus.ACTIVE;
    }

    public void changeStudentStatus(StudentStatus sta){
        this.status = sta;
    }
}
