package day_07_operators_casting_boolean_if;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class BooleanComparisonOperators {
    public static void main(String[] args) {
        System.out.println( 10 > 5); //true
        System.out.println(10 > 11); //false

        System.out.println(88 >=77); //true
        System.out.println(99 >=99); //true
        System.out.println( 100 >=119 ); //false

        System.out.println(6 < 7);
        System.out.println(15 < 7);

        System.out.println(10 <= 15); //true
        System.out.println(10 <= 10); //true
        System.out.println(10 <=1); //false

        System.out.println(100 == 100); //true
        System.out.println(100 == 1000); //false

        System.out.println(5 != 4);  //true
        System.out.println(10 != 10); //false
        //==================================

        int num1 = 100;
        int num2 = 200;
                           //100   200
        System.out.println(num1 > num2); //false
        System.out.println(num1 < num2); //true


        System.out.println(num1 == num2); //false
        System.out.println(num1!= num2); //true

        //====================================

        boolean b1 = 123 > 100;
        System.out.println("b1 : " + b1) ; //true

        int currentSpeed = 60;
        int speedLimit = 55;
        boolean overLimit = currentSpeed > speedLimit; //true
        boolean overLimit2 = speedLimit < currentSpeed; //true

        System.out.println("overLimit: " + overLimit);
        System.out.println("overLimit2: " + overLimit2);

        currentSpeed = 55;
        boolean  underOrAtLimit = currentSpeed <= speedLimit;

        System.out.println("underOrAtLimit: " + underOrAtLimit);

        boolean atExatLimit = currentSpeed == speedLimit;
        System.out.println("AtExactLimit: " + atExatLimit);

        double balance = 150.0;
        boolean broke = balance  <= 0.0;

        System.out.println("Am i broke? - " + broke);

        double bagPrice = 220.0;
        //check if you can afford bag
        broke = balance <= bagPrice;
        broke = (balance - bagPrice) <= 0.0;

        System.out.println("Am i broke? - " + broke);

        char letter1 = 'A'; //65
        char letter2 = 'B'; //66
        System.out.println(letter1 > letter2);//false
        System.out.println(letter1 < letter2);//true
        System.out.println(letter1 != letter2);//true

        System.out.println("wooden spoon" == "wooden spoon");
        String str  = "java";
        System.out.println(str == "java");//true
        System.out.println(str != "java");//false







    }
}
