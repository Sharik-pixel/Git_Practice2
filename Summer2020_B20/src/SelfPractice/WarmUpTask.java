package SelfPractice;
/*
1. write a java program that accepts three numbers and return the maximum number
                (assume that none of them are equal)
    2. write a java program that accepts three numbers and return the minimum number
                (assume that none of them are equal)
    3. write a java program that accepts three numbers and return the minimum number
                (assume that none of them are equal)
    4. write a java program that can identify if a person is eligible to buy alcohol


 */
public class WarmUpTask {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        int c = 300;

        if (a < b) {
            System.out.println(b + " is the max number");

        }

        if (c > b)
            System.out.println(c + " is the max number");


        int a1 = 50;
        int b2 = 300;
        int c3 = 2000;

        if (a1 < b2) {
            System.out.println(a1 + " is the min number");
        }

        if (b2 < c3)
            System.out.println(b2 + " is the min number");


        int d = 23;
        boolean Eligible = 23 >= 21;

        if(d >= 21){
            System.out.println(d + " is eligible for by alcohol");

        }






        }
    }