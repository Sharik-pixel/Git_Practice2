package day35_ArraysList;

    /*
    2. write a program that can return the sum of all the digits from a string
            ex:
                input: "a1b2c3"
                output: 6
                    (1+2+3= 6)

                    (0+4+2+7+2+0+2+0=17)
            HINT: on ascii table, the characters between #48 ~ #57 are digits
     */



public class SumOfDigits {

    public static void main(String[] args) {

        String str = "a1b2c3";
        int sum = 0; // 1+2
        // 49=50=51


        for(int i = 0; i<= str.length()-1; i++){

            char each = str.charAt(i) ; // a,1,b,2,c,3

            if( each>= 48 && each <= 57){ // if the char is between 48~57, then its digit

                sum += Integer.parseInt(""+each); // convert the char ti Integer then add it ot the sum

            }


        }

        System.out.println(sum);






    }
}
