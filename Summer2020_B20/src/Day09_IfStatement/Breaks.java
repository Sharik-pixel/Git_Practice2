package Day09_IfStatement;

public class Breaks {
    public static void main(String[] args) {


        String itsBreakTime = "yes";

        if (itsBreakTime == "yes") {
            System.out.println("Take 15 min of break");
        } else {
            System.out.println("Continue the class");


        }
        System.out.println("---------------------------");

        int a = 300;
        int b = 700;


        if( a > b){
            System.out.println(a+ " is greater");
        }else{ // a < b
            System.out.println(b+" is greater");
        }
    }
}