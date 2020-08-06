package day14_Recap;

import java.util.Scanner;
/*
1. write a program that can caluclate the garade of the student based on the given score
                    90 <= score <= 100 ==> Excellent
                    80 <= score <= 89 ==> Great
                    70 <= score <= 79 ==> Good
                    60 <= score <= 69 ==> Passed
                    0 <= score <= 59 ==> Failed
                    other == > Invalid Entry
            MUST use Scanner and nested IF
            if  0 <= score <= 100 ==> valid
            else ==> Invalid Entry
 */
public class Grade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double score = scan.nextDouble();
            scan.close(); // closes the scanner we will not be able to use it afterword

        String result = "";

        if(score >= 0 && score <= 100) { // 5 possible outcomes
            if (score >= 90) {
            result = "Exellent";

        }else if(score >= 80) {
            result = "Great";

        }else if(score >= 70) {
            result = "Good";

        }else if(score >= 60) {
            result = "Passed";

        }else{
            result = "Failed";

        }

    }else{ // 1 possible outcomes
            result = "Invalid Entry";

        }

        System.out.println(result);

    }
}
