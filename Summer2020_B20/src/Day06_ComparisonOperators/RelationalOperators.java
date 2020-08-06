package Day06_ComparisonOperators;

public class RelationalOperators {
    public static void main(String[] args) {
        boolean r1 = 10 > 9;
        System.out.println(r1);
        boolean r2 = 100<100;
        System.out.println(r2);

        // >=
        boolean r3 = 87 >= 85; // true
        System.out.println(r3);

        boolean r4 = 877 >= 878; // false
        System.out.println(r4);

        // <=
        boolean r5 = 200 <= 300; // true
        System.out.println(r5);

        // == equal
        boolean r6 = 900 == 800; // false
        System.out.println(r6);

        boolean r7 = true == false; // false
        System.out.println(r7);

        boolean r8 = "Adam" == "Good Guy"; // false
        System.out.println(r8);

        boolean r9 = "adam" == "Adam";
        System.out.println(r9);

        //  boolean r10 = "123" == 123;

        // !=

        boolean r11 = "Adam" != "Bad guy";
        System.out.println(r11);

        boolean r12 = true != false;
        System.out.println(r12);

        boolean result1 = 'A' == 65;
        System.out.println(result1);

        boolean result2 = 100 == 100.0; // true or 100$ 100.0 -> true
        System.out.println(result2);


        boolean result4 = "100" == "100.0";
        System.out.println(result4);

        int number = 101;
        boolean even = number%2 ==0;
        boolean odd = number%2 != 0;

        System.out.println(even); // false
        System.out.println(odd); // true










        /*
        >   greater
			>   less than
			>=  greater or equal
			<=  less than equal   ---> boolean

			==  equal
			!=  not equal

9 > 8 -> true
7 < 6 -> false
7 >= 7 -> true
8 >= 6 -> true
9 <= 25 -> true

10 == 10 -> true
true == false -> false
'A' == 'A' -> true
"Adam" == good boy -> false

9 != 10  -> true
true != false -> true

         */
    }
}
