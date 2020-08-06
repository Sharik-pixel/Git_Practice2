package Office_Hours.Practice_07_13_2020;

public class FrequencyOfChar1 {

    public static void main(String[] args) {

        String str = "OOPQQ";    //  "O2P1Q2"
        String nonDup = " " ;   //   "OPQ"


          // remove duplicates
        for(int i = 0; i <= str.length() -1;i++ ){
           String s =  ""+str.charAt(i); // s: O O P Q Q
            System.out.println(s);
        if(! nonDup.contains(s)){ // if the character is not already exist then  we concate it to the nonDup
            nonDup += s;
            }
        }




        String result = ""; // O2P1Q2


        //nonDup = "OPQ"  "OOPQQ"  --> O2P1Q2

        char ch1 = nonDup.charAt(0); // O
        int count1 = 0; // 1+1 = 2
        for(int i = 0; i <= str.length()-1; i++ ){ // counting the  frequency
           char each = str. charAt(i); // O O P Q Q
            if(each == ch1){
                count1 += 1;

            }

        }

        result +=   ""+ch1+count1;


        char ch2 = nonDup.charAt(1); // p
        int count2 = 0;
        for(int i = 0; i <= str.length() -1;i++ ){
            char each = str.charAt(i); // 0 0 P Q Q
            if( each == ch2){
                count2 +=1;

            }
        }

            result += ""+ch2+count2;

        char ch3 = nonDup.charAt(2); // Q
            int count3 = 0;
            for(int i = 0; i <= str.length()-1; i++ ){
                char each = str.charAt(i);
                if(each == ch3){
                    count3++;

                }

            }
            result += ""+ch3+count3;

        System.out.println(result);
































    }
}
