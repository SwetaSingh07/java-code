//Write a program on Paramterized this calling stament
package assignment.module1;

public class Assignment_92 {

    String name;
    int age;

    // Default constructor
    Assignment_92() {
        this("Unknown", 0);  // calling parameterized constructor
        System.out.println("Default Constructor");
    }

    // Parameterized constructor
    Assignment_92(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized Constructor");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Assignment_92 s1 = new Assignment_92();  // calls default → parameterized
        s1.display();
    }
}