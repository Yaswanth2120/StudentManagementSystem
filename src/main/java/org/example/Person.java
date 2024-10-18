package org.example;

public class Person {
    private String name;
    private int age;

    //Constructor
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //getter and setter methods for the name
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    //Method to introduce the Person
    public void introduce(){
        System.out.println("Hi, My name is "+ name + "and I am "+ age + "years old");
    }
}
