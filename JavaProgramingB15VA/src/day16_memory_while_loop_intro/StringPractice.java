package day16_memory_while_loop_intro;

public class StringPractice {
    public static void main(String[] args) {
        String word = "abc"; //always 3 characters
        String reversed = ""; // cba dad

         /*
        read third letter from word
        and concatenate to reversed
        read second letter from word
        and concatenate to reversed
        read first letter from word
        and concatenate to reversed
        */

        System.out.println(word.charAt(2));
        reversed = reversed + word.charAt(2); //  abc word: "dad"
        System.out.println("reversed = " + reversed);

        reversed += word.charAt(1); // ab
        System.out.println("reversed = " + reversed);

        reversed += word.charAt(0); // abc
        System.out.println("reversed = " + reversed);

        String reversed2 = ""; //         d               a              d
        reversed2 = reversed2+word.charAt(2)+ word.charAt(1)+word.charAt(0); // abc dad

        System.out.println(""+word.charAt(2)+ word.charAt(1)+word.charAt(0));

        if(word.equals(reversed)){
            System.out.println("Pallindrome 3 letter word");
        }else{
            System.out.println("Non-palindrome 3 letter word");

        }

        String rev = "";
        rev = rev.concat("abc").concat("wzx");
        System.out.println(rev);

        rev = rev.concat(""+word.charAt(0));
        System.out.println(rev);

    }
}

