package day18_ForLoop;
import java.util.Scanner;
/*
2.Write the program that can  reverse the folowing strings:

				String str = "Java";
				output: avaJ

		please provide two solutions:
			first solution, you MUST use charAt method
 */
public class Reverse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        String s = "Java";
        //             avaJ --> ava , J

       String s1 = str.substring(1); // "ava'

       String s2 =  str.substring(0, 1); // "J"
        //   char ch1 = str.charAt(0);
       String result1 = s1 + s2; // "avaJ"

       System.out.println(result1 );








    }
}
