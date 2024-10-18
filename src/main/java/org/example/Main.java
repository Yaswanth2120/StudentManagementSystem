package org.example;

public class Main {
    public static void main(String[] args) {
        // Create an undergraduate student
        Undergraduate undergrad = new Undergraduate("Alice", 20, "UG123", 2);
        undergrad.introduce();
        undergrad.enrollInCourse("Math 101");

        System.out.println();

        // Create a graduate student
        Graduate grad = new Graduate("Bob", 25, "GR456", "Machine Learning");
        grad.introduce();
        grad.enrollInCourse("Advanced AI");
    }
}
