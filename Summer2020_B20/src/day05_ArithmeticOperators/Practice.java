package day05_ArithmeticOperators;

public class Practice {
    public static void main(String[] args) {
        int a = 5 + 2 * 4; // 13
        System.out.println(a);

        int b = 10 / 2 - 3;
        System.out.println(b); // 2

        int c = 8 + 12 * 2 - 4;
        //      8 + 24 - 4 = 28
        System.out.println(c);

        int  d = 4 + 17 % 2 -1;
        //       4 + 1 -1 = 4
        System.out.println(d);

        System.out.println( 5 + 5 / 5); // 6
        System.out.println(   (5 + 5)  / 5 ); //2
        //                     10 / 5

        System.out.println(   (5+ 5 )  / 5.0); // 2.0

        double y = 5 * 2 / 3 + ( 4 * 3);
        //      5 * 2 / 3 + 12
        //      10 / 3 + 12
        //      3.333 + 12 = 15.3333
        System.out.println(y);

        double t = 10 / 3 ; // 3.0
        System.out.println(t);



        /*
        Task1.
     Write a Java program that will print a sum of two numbers
     Please use variables to store num1,num2,and sumSample output:46 + 90 = 1362.
     Write a Java program to convert Fahrenheit to CelciusF=9*C/5+323.
     Write a Java program that converts mile to km1 mile = 1.609344 km
         */

    int num1 = 12;
    int num2 = 13;
    int sumSample = num1 + num2;

    System.out.println(sumSample);

    int C = 32;
    int F = C * 9/5 + 32;
        System.out.println( F );

    byte mile = 25;
    double km = 1.609344 * 25;
        System.out.println( km );



        /*
        Task2.
         Write a Java program that displays the area and perimeter of a circle
         that has a radius of 5.5 using the following
         formulas:perimeter = 2 * radius * 𝜋
         area = radius * radius * 𝜋.


         */

        double radius = 5.5;
        float PI = 3.14f;
        double perimeter = 2 * radius * PI;
        System.out.println(perimeter);

        double area = radius * radius * PI;
        System.out.println(area);




/*
double kg = 83.5;
        double pound = kg * 2.2;
        System.out.println(pound)
 */

/*
Write a Java program that displays the area of a rectangle
           with a width of 4.5 and a height of 7.9 using the following
            formula:area = width * height.

            Write a Java program that calculates the average of 3 numbers.
 */

        double width = 4.5;
        double height = 7.9;

        double area1 = width * height;
        System.out.println(area1);





    }
}
