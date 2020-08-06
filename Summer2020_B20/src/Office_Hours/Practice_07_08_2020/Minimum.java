package Office_Hours.Practice_07_08_2020;

/*
    finding minimum number from user inputs

 */


import java.util.Scanner;

public class Minimum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int min = 2147483647; // 1
        // whatever user enters it will ALWAYS BE LESS THAN 2147483647

        for(int i = 0; i < 5; i++){

            System.out.println("Enter a number");
            int n = scan.nextInt(); // 5  4  6  3  1

            if( n < min ){
                min = n;

            }

        }

        System.out.println("min: "+min);









    }
}
