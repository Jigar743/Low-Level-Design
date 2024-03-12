package DesignPatterns.Prototype;

public class IntelligentStudent extends Student {
    private int iq;
    IntelligentStudent(){}
    IntelligentStudent(IntelligentStudent i){
        super(i);
        this.iq = i.iq;
    }

    public void setIq(int iq){
        this.iq = iq;
    }

    void IntelligentStudentDetails(){
        super.StudentDetails();
        System.out.println("Iq: " + this.iq);
    }

    @Override
    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
    }
}
