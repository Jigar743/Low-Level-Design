package DesignPatterns.Builder;

public class Main {
    public static void main(String[] args) {
        try {
            Student student = Student.getBuilder()
                    .setId(1)
                    .setName("Jigar")
                    .setAge(24)
                    .setPsp(70.0)
                    .setUnivName("Charusat Uni")
                    .setGradYear(2021)
                    .Build();

            student.printStudentDetails();
        } catch (IllegalAccessError e){
            System.out.println(e.getMessage());
        }

    }
}
