# Student Management System

## Project Overview

The **Student Management System** is a simple Java-based application that demonstrates core **Object-Oriented Programming (OOP)** concepts such as **Encapsulation**, **Inheritance**, **Polymorphism**, and **Abstraction**. The system allows you to manage different types of students (e.g., Undergraduate and Graduate), assign courses to students, and manage student information. The project is implemented using Java and runs as a console-based application.

## Features

- **Person Class**: A base class that includes common attributes like `name` and `age`.
- **Student Class**: Inherits from the `Person` class and adds additional student-specific details like `studentID`.
- **Undergraduate and Graduate Classes**:
    - `Undergraduate` students have a `yearOfStudy` attribute.
    - `Graduate` students have a `thesisTopic` attribute.
- **Enroll in Courses**: Students can enroll in courses, and different types of students introduce themselves with customized messages.

## OOP Concepts Demonstrated

1. **Encapsulation**:
    - Private fields with public getters and setters (e.g., `name`, `age`, `studentID`).

2. **Inheritance**:
    - `Person` as a base class.
    - `Student` inherits from `Person`, and `Undergraduate` and `Graduate` inherit from `Student`.

3. **Polymorphism**:
    - The `introduce()` method is overridden in the `Undergraduate` and `Graduate` subclasses to provide custom behavior.

4. **Abstraction**:
    - We have abstracted the common functionality in the `Person` and `Student` classes to provide a clean separation between common and specific behaviors.

## Installation and Usage

### Prerequisites

- Java Development Kit (JDK) installed on your machine.
- An IDE (like **IntelliJ IDEA** or **Eclipse**) to open and run the project.

### Cloning the Repository

To get started, clone this repository to your local machine:

```bash
git clone https://github.com/Yaswanth2120/StudentManagementSystem.git
