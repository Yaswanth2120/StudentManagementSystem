package org.example;

public class Student extends Person{
    private String studentID; // Encapsulated student-specific field

    // Constructor
    public Student(String name, int age, String studentID) {
        super(name, age);  // Call to the superclass constructor (Person)
        this.studentID = studentID;
    }
    //Getter and Setter methods for the studentID
    public String getStudentID(){
        return studentID;
    }

    public void setStudentID(String studentID){
        this.studentID = studentID;
    }

    //Method to introduce the student(Overrides the introduce method in Person)
    @Override
    public void introduce(){
        System.out.println("Hi, I am "+ getName()+", and I am a Student with ID"+studentID);
    }

    //Abstract method for enrolling in courses
    public void enrollInCourse(String course){
        System.out.println(getName()+"has enrolled in "+ course);
    }

}
