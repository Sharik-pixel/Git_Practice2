package day22_NestedLoop;

/*

1. Write a program that asks user to enter String. If String started with uppercase &
 			ends with lowercase letter then print "true", otherwise print "false".

 						Ex:
 							Input: Cybertek
 							Output: true


 							Input: Cybertek
 							Output: false
 */

import java.util.Scanner;

public class UpperLower {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String word = scan.next();

        char ch1 =  word.charAt(0);
        char ch2 = word.charAt( word.length()-1);

        boolean start = ch1 >= 'A' && ch1 <= 'Z'; // upper case characters
        boolean end = ch2 >= 'a' && ch2 <= 'z'; // lower case characters

       //  System.out.println(start && end);

        if(start && end){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}
