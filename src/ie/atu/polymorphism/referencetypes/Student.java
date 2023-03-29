package ie.atu.polymorphism.referencetypes;

public class Student {
    
    // Instance variables
    private int StudentID;

    // Constructor
    public Student(int studentID) {
        StudentID = studentID;
    }
    
    //Getter and Setter methods
    public int getStudentID() {
        return StudentID;
    }

    public void setStudentID(int studentID) {
        StudentID = studentID;
    }
}
