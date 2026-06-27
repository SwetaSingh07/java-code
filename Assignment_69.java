/*Write a program using nested if and scanner class
a. female having aadhar card - free travel 
b. female no aadhar card - full price 
c. male - ful price 
d. male - senior citizen - 50% price 
e. kids below 5 years free 
f. kids between 5 to 10 years 10% price  */

package assignment.module1;

import java.util.Scanner;

public class Assignment_69 {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Does a person have Aadhar card (Yes/No): ");
        String a = sc.next();

        System.out.println("Enter your Gender as 'F' or 'M': ");
        char g = sc.next().charAt(0);

        System.out.println("Enter your Age: ");
        int age = sc.nextInt();

        // Kids condition first
        if (age < 5) {
            System.out.println("Free travel");
        } 
        else if (age >= 5 && age <= 10) {
            System.out.println("Pay only 10% of the price");
        } 
        else {
            // Adult conditions
            if (g == 'F') {
                if (a.equalsIgnoreCase("Yes")) {
                    System.out.println("Free travel");
                } else {
                    System.out.println("Pay full price");
                }
            } 
            else if (g == 'M') {
                if (age >= 65) {
                    System.out.println("Pay only 50% of the price");
                } else {
                    System.out.println("Pay full price");
                }
            } 
            else {
                System.out.println("Invalid gender input");
            }
        }

        sc.close();
    }
}

