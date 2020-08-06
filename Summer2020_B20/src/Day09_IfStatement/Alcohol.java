package Day09_IfStatement;
/*
warm up tasks:

    1. write a java program that accepts three numbers and return the maximum number
                (assume that none of them are equal)
    2. write a java program that accepts three numbers and return the minimum number
                (assume that none of them are equal)
    3. write a java program that accepts three numbers and rteurn the mediam number
                (assume that none of them are equal)
    4. write a java program that can identify if a person is eligible to buy alcohol

 */
public class Alcohol {
    public static void main(String[] args) {
        boolean hasID = true;
        int age = 26;

        boolean eligible = hasID && age > 21;
        //                 true  && false -> false

        String result = "";

        if(eligible  == true){
        //  System.out.println("Eligible to buy alcohol");
            result = "Eligible to buy alcohol";

        }
        if(eligible == false){
        //    System.out.println("Go buy your milk");
            result = "You are not old enough to buy alcohol";

        }
        System.out.println(result);


    }
}
