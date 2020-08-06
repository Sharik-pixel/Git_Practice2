package Day23_Arrays;

/*
3. write a program that can return the frequency of every single characters from the string:
    ex:
     str1 = "aabbccaa";
     output: a4b2c2
       HINT:
      easier approach:
          1. remove duplicates ==> str2 = "abc"
          2. then find each of str2' character' frequency in str1 ==> 4, 2, 2
          3. result: a4b2c2
           previous section we leaned how to find the frequency of one character.
           you will need to repeat the same steps

 */

public class FrequencyOfChar {
    public static void main(String[] args) {

        String str = "BBCCDD";  //
        String nonDup = "";  //"BCD

        for (int i = 0; i <= str.length() - 1; i++) {
            String ch = "" + str.charAt(i); // B, B , C, C, D, D

            if (nonDup.contains(ch)) {
                continue;
            } else {
                nonDup += ch;

            }
        }


        String expectedResult = "";     //B2C2D2

        // str = BBCCDD                 nonDup = "BCD" -> B2C2D2

        char ch1 = nonDup.charAt(0); // B
        int count1 = 0; //1+1 = 2
        for (int i = 0; i <= str.length() - 1; i++) {
            if (str.charAt(i) == ch1) {
                count1++;

            }

        }

        expectedResult += "" + ch1 + count1;




        char ch2 = nonDup.charAt(1); // C
        int count2 = 0; // 2
        for (int i = 0; i <= str.length() - 1; i++) {
            if (str.charAt(i) == ch2) {
                count2++;

                expectedResult += "" + ch2 + count2;


                System.out.println(expectedResult);


            }
        }


    }
}