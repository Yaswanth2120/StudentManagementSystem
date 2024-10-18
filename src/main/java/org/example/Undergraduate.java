package org.example;

public class Undergraduate extends Student {
    private int yearOfStudy;

    //Constructor
    public Undergraduate(String name, int age, String studentID, int yearOfStudy){
        super(name,age,studentID); //Call to the student constructor
        this.yearOfStudy = yearOfStudy;
    }

    //Getter and Setter methods of yearOfStudy
    public int getYearOfStudy(){
        return yearOfStudy;
    }
    public void setYearOfStudy(int yearOfStudy){
        this.yearOfStudy = yearOfStudy;
    }

    //Override introduce method for undergraduates
    @Override
    public void introduce(){
        System.out.println("Hi I am an undergraduate student,"+ getName() + ", in year"+yearOfStudy+".");
    }
}
