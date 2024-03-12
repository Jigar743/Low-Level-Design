package DesignPatterns.Builder;

public class Student {
    int id;
    String name;
    int age;
    double psp;
    String univName;
    int gradYear;

    private Student(Builder builder) {
        this.id = builder.getId();
        this.name = builder.getName();
        this.age = builder.getAge();
        this.psp = builder.getPsp();
        this.univName = builder.getUnivName();
        this.gradYear = builder.getGradYear();
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public void printStudentDetails() {
        System.out.println("Student id: " + id + " Name: " + name + " Age: " + age
                + " Psp: " + psp + " University Name: " + univName + " Graduation year: " + gradYear);
    }

    static class Builder {
        int id;
        int age;
        double psp;
        String name;
        String univName;
        int gradYear;

        public int getId() {
            return id;
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public String getUnivName() {
            return univName;
        }

        public Builder setUnivName(String univName) {
            this.univName = univName;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Student Build() {
            // we can do add here validation before calling student class construction

            if (age >= 25) {
                throw new IllegalStateException("Age must be less than 25");
            }

            return new Student(this);
        }
    }
}
