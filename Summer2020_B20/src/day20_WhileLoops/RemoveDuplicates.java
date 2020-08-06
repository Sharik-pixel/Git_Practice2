package day20_WhileLoops;
/*
3. write a program that can remove the duplicates from any given String
            Ex:
                input: abcabcaabb
                output: abc
 */
public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "abab"; // "ab"
        //            01234

        String result = ""; // "ab"

        for(int i = 0; i <= str.length()-1; i++ ){
           String s = ""+str.charAt(i); // a,,b,a, b

            if(!result.contains(s)){ // if the character is already contained
                // in result. we  will continue
                result += s;
            }

        }
        System.out.println(result);

    }
}
