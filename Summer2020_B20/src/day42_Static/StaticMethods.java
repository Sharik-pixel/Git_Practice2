package day42_Static;

public class StaticMethods {

    int a = 200;
    static int b = 400;

    public static void main(String[] args) {
        System.out.println(b);
    //    System.out.println(a);
    //    System.out.println(this.a);

    StaticMethods obj = new StaticMethods();
        System.out.println( obj.a );
    // the only way call instances in a static method

    }


}


