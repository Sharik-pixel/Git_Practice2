package day19_ForLoop;

import java.util.Scanner;

/*
write a program that can calculate the sum of all numbers
 between 1 to  any  given number
    Ex:
    input
 */
public class SumOfNums {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter number");
        int num = scan.nextInt();

        int sum = 0;

        if(num > 1){

        for(int i = 0; i <= num; i++){
             // sum = sum +i ;
            sum += i;

            }
            System.out.println(sum);

        }else{
            System.out.println("Invalid number");
        }


    }
}
