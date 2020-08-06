package day_13_string_manipulation;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class StringCharAt {
    public static void main(String[] args) {
        String company = "Cybertek";
        System.out.println(company.length());//8. it starts the count from 1
        System.out.println(company.charAt(0));//C
        System.out.println(company.charAt(1));//y
        System.out.println(company.charAt(2));//b
        System.out.println(company.charAt(3));//e
        System.out.println(company.charAt(4));//r
        System.out.println(company.charAt(5));//t
        System.out.println(company.charAt(6));//e
        System.out.println(company.charAt(7));//k
        // System.out.println(company.charAt(8)); StringIndexOutOfBoundsException

        //store first letter into first variable
        char first = company.charAt(0);
        System.out.println("first = " + first);
        //check if first character is 'C'
        //print "C is first letter" "C is not first letter"

        if (company.charAt(0) == 'C') {
            System.out.println("C is first letter");
        } else {
            System.out.println("C is not first letter");
        }
        //01234
        String word = "civic";//palindrome word
        //read first and last characters and store into firstL, lastL variables
        char firstL = word.charAt(0);
        char lastL = word.charAt(4);//word.charAt(word.length()-1)
        //put a condition if they match.
        //if yes -> "first and last match", "first and last do not match"
        if (firstL == lastL) {
            System.out.println("first and last match");
        } else {
            System.out.println("first and last do not match");
        }
        //c i v i c
        System.out.println(word.charAt(0) + " " +word.charAt(1)+", "+word.charAt(2)+", " +word.charAt(3)+" "+word.charAt(4));

    }
}