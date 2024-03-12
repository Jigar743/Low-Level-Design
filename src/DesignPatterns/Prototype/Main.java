package DesignPatterns.Prototype;

public class Main {
    public static void fillRegistry(StudentRegistry studentRegistry){
        Student juneBatchStudent = new Student();
        juneBatchStudent.setBatch("June 2022");
        juneBatchStudent.setAvgBatchPsp(80.9);
        juneBatchStudent.setName("Jigar Modi");
        juneBatchStudent.setStudentPsp(90.5);
        juneBatchStudent.setAge(24);

        System.out.println("After creating an object of Student");
        juneBatchStudent.StudentDetails();

        studentRegistry.Register("june2022", juneBatchStudent);
    }
    public static void fillRegistryForIntelligentStudent(IntelligentStudentRegistry intelligentStudentRegistry){
        IntelligentStudent juneBatchStudent = new IntelligentStudent();
        juneBatchStudent.setName("Jigar Modi");
        juneBatchStudent.setAge(24);
        juneBatchStudent.setStudentPsp(90.8);
        juneBatchStudent.setBatch("June 2022");
        juneBatchStudent.setAvgBatchPsp(80.4);
        juneBatchStudent.setIq(185);

        System.out.println("After creating an object of Intelligent Student");
        juneBatchStudent.IntelligentStudentDetails();

        intelligentStudentRegistry.register("june2022", juneBatchStudent);
    }
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        // here we are creating a deep copy of a student object
        Student student = studentRegistry.get("june2022").clone();
        System.out.println("After cloning an object of Student");
        student.StudentDetails();

        IntelligentStudentRegistry intelligentStudentRegistry = new IntelligentStudentRegistry();
        fillRegistryForIntelligentStudent(intelligentStudentRegistry);

        IntelligentStudent intelligentStudent = intelligentStudentRegistry.get("june2022").clone();
        System.out.println("After cloning an object of Intelligent Student");
        intelligentStudent.IntelligentStudentDetails();
    }
}
