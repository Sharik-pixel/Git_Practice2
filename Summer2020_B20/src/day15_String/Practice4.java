package day15_String;

import java.util.Scanner;

/*
2. write a program that ask user  to enter firstNmae & lastName
then print the fullName in all UPPER CASE
 */
public class Practice4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first Name: ");
        String firstName = input.next();// Cybertek

        System.out.println("Enter your last Name: ");
        String lastName = input.next(); // school

        String fullName = firstName +" " + lastName;

        fullName = fullName.toUpperCase(); //CYBERTEK DSCHOOL

        System.out.println(fullName);






    }
}
