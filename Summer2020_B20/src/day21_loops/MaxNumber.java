package day21_loops;

import java.util.Scanner;

/*

1. Write the program that asks users enter 5 numbers and
 returns the maximum number

 */
public class MaxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


    int max = -9999999; // 30

    for(int i = 10; i <= 50; i += 10){

         System.out.println("Enter a number");
         int num1 = scan.nextInt(); // 20, 5,10,30,3

        if(num1 > max){
            max = num1;
        }

        }
        System.out.println("Max number: "+max);













    }
}
