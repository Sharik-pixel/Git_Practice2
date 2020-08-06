package day29_CustomMethods;

    /*
     9. write a method that can check if a string is palindrome, print true if it's  otherwise print false
    */
public class PalindromeTest {

    /*

    kayak --> kayak true
Lava --> avaJ  false

    */

    public static void main(String[] args) {
        palindrome("Cybertek");
    }
    public static void palindrome(String word){

        String reversed = "";
        for( int i = word.length()-1; i >= 0; i--){
            reversed += word.charAt(i);
        }

        System.out.println(reversed.equalsIgnoreCase(word));
    }

}
