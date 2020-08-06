package day08_LogicalOperators;

public class Practice {
    public static void main(String[] args) {
        String firstName = "Aaron";
        String lastName = "Daniel";
        int age = 30;
        String citizenShip = "Russia";

        boolean eligibleToVote = age >= 18 && citizenShip == "USA" ;
        //                       19 >= 18  &&  "China"  == "USA"
        //                          true   &&   true  ->


        String fullName = firstName + " " + lastName;
        System.out.println(fullName+ " is eligible to vote: " + eligibleToVote );
        // Aaron Daniel is eligible to vote: true



    boolean r6 = !true && false;  // false
    boolean r7 = !false && 9 > 8; // true

    //  ||: or

        boolean r8 = true == !false || false == true;

        System.out.println(r8);


       boolean r9 = !false == false || true == !false;
       System.out.println(r9);

       boolean r10 = !false == false && true == !false;
       System.out.println( r10 );










    }
}
