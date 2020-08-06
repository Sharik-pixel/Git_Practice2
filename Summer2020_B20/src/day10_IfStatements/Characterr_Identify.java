package day10_IfStatements;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Characterr_Identify {
    public static void main(String[] args) {
        char character = '$';
        //                          65 <= character  <=90          ||    97 <= character <=122
        boolean isAlphabetic = (character >= 65 && character <= 90 || (character >= 97 && character <= 122));
        //                      upper  case  letters     || lower Case letter

        //    48 <= CHARACTER <= 57;
        boolean isDigit = character >= 48 && character <= 57;

        boolean specialChar = isAlphabetic == false && isDigit == false;
                // !isAlphabetic && !isDigit;

        String alphabet = "";


        if (isAlphabetic == true) {
            //  System.out.println(character + " is Alphabetic character");
            alphabet = character + " is Alphabetic character";

        } else {
            //   System.out.println(character + " is not  Alphabetic character");
            alphabet = character + " is not  Alphabetic character";

        }

        System.out.println(alphabet);

        String digit = "";

        if (isDigit == true) {


            digit = character + " is digit";
        } else {
            digit = character + " is not digit";
        }

        System.out.println(digit);

        String c = "";
        if(specialChar == true){
            c = character+" is a special character";

        }else{
            c = character +"  is  not a special character";

        }
        System.out.println(c);






    }
}