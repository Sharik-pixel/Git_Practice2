package day11_Ternery;
/*
// second task: "Can vote" or "Cannot vote"
 */

public class Ternery_Practice1 {
    public static void main(String[] args) {
        int age = 16;
        String citizen = "USA";

        String result = "";

        if(age >= 18 && citizen == "USA"){
            result = "Can vote";
        }else{
            result = "Can Not vote";

        }

        System.out.println(result);

        String  result2 =  (age >= 18 && citizen == "USA") ? "Can vote" : "Can Not vote";

        System.out.println(result2);

        System.out.println("=====================================" );

        int n1 = 100;
        int n2 = 200;

        String r = (n1 == n2) ? "equal" : "Not equal";
       // "equal" or not "Not equal

        System.out.println(r);


    }
}
