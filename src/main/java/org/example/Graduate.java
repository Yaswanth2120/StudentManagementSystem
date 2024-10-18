package org.example;

public class Graduate extends Student{
    private String thesisTopic;

    //Constructor
    public Graduate(String name, int age, String studentID, String thesisTopic){
        super(name, age, studentID); //Call to the student class
        this.thesisTopic = thesisTopic;
    }
    //Getter and setter methods for thesisTopic
    public String getThesisTopic(){
        return thesisTopic;
    }
    public void setThesisTopic(String thesisTopic){
        this.thesisTopic=thesisTopic;
    }

    //Override introduce method to graduates
    @Override
    public void introduce() {
        System.out.println("Hi, I am a graduate student named " + getName() + ", working on the thesis: " + thesisTopic + ".");
    }
}
