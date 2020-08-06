package day11_Ternery;
/*
    write a programm that can find the number of days in a month
    (MUST APPLY NESTED IF)

 */
public class DaysInMonth2 {
    public static void main(String[] args) {

        int month = 12;
        boolean validNumber = month >= 1 && month <= 12;


        boolean  days28 = month == 2;
        boolean days30 = month  == 4 || month == 6 || month == 9 || month  == 11;

        String result = "";

        if (validNumber) {  // for 28 days 0r 30 days or 31 days
            if(days28){
                result = "28 days";
            }else if(days30){
                result = "30 days";
            }else{
                result = "31 days";
            }

        }else{   // Invalid month
                result = "Invalid";

        }
        System.out.println(result);
    }
}