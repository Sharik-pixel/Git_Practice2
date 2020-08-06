package day21_loops;


/*
4 write the program that can divide two numbers without using / & % operators
 and returns the division and reminder
		 ex:
		 input: 10
		         3

		 output: 3 with a reminder of 1

		10 / 3 = 3

		10 - 3 = 7  // 10 -> numerator (числитель)
		7 - 3 = 4;  // 3  -> dinaminator (делитель)
		4 - 3 = 1;

		3 / 3 -> even if the numerator same dinaminator , yes we can subtract
		3 - 3 = 0 -> subtracting 1 time

 */

public class DivideTwoNumbers {
    public static void main(String[] args) {


        int a = 10;
        int b = 3;

         if(b == 0){
             System.out.println("Invalid Input");
             System.exit(0); // forcefully terminating the program
    }


        int count = 0;

         while( a >= b){
            a -= b;
            count++;
         }
        System.out.println(count+" with a reminder of "+a);

    }
}


