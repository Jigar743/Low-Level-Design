package DesignPatterns.Prototype;

public class Student implements Prototype<Student>{
    private int age;
    private String name;
    private String batch;
    private double avgBatchPsp;
    private double studentPsp;

    Student(){}

    // Copy constructor
    Student(Student s){
        this.age = s.age;
        this.name = s.name;
        this.studentPsp = s.studentPsp;
        this.batch = s.batch;
        this.avgBatchPsp = s.avgBatchPsp;
    }

    void StudentDetails(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Psp: " +this.studentPsp);
        System.out.println("Batch: " +this.batch);
        System.out.println("Average psp of batch: " + this.avgBatchPsp);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setAvgBatchPsp(double avgBatchPsp) {
        this.avgBatchPsp = avgBatchPsp;
    }

    public void setStudentPsp(double studentPsp) {
        this.studentPsp = studentPsp;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }
}
