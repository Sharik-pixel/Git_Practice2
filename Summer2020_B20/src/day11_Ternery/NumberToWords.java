package day11_Ternery;
/*
1. write a java program that can convert numbers between
0 ~ 9 to words, if the number is greater than 9 or less than zero,
 out put should be "Invalid".


2. write a program that can find the number of days in a month
        (Assume that Feb has 28 days)
         HINT:
                28 days: 2
                30 days: 4,6,9,11
                31 days: 1,3,5,7,8,10,12
                Invalid: num < 1 || num > 12
 */
public class NumberToWords {
    public static void main(String[] args) {

        int num = 9;

        String result = "";

        if(num == 0){
           result  = "zero";
        }else if(num == 1){
            result = "one";
        }else if(num == 2){
            result = "two";
        }else if(num == 3){
            result = "three";
        }else if(num == 4) {
            result = "four";
        }else if(num == 5){
            result = "five";
        }else if( num == 6){
            result = "six";
        }else if(num == 7){
            result = "seven";
        }else if(num == 8){
            result = "eigth";
        }else if(num == 9){
            result = "nine";
        }else{ // (num < 0 || num > 9;
            result = "invalid";
        }

        System.out.println(result);

    }
}
