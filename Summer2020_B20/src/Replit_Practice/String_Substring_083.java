package Replit_Practice;


import java.util.Scanner;

/*

    using substring method output the first two letters of txt string
    for example:
    String txt = "foo"
    the first two letters are "fo"

use print not println.

 */
public class String_Substring_083 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word");

        String word = "Java";
        String a = word.substring(0,1) ;
        String str = scan.next();
        System.out.println(word);

    }
}


//String sentence = "Java is fun";
//        //                 0123456789..
//
//        // substring (beginning index, end index)
//        String word1 = sentence.substring(0, 4);
//        System.out.println(word1);

//String answer = scan.next();