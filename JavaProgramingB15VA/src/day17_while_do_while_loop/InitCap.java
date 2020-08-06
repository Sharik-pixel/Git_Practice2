package day17_while_do_while_loop;

public class InitCap {
    public static void main(String[] args) {
                     //0123
        String word = "sunDAY";
        System.out.print(word.substring(0,1 ).toUpperCase());
        System.out.println(word.substring(1).toLowerCase());

        String InCap = word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase();
        System.out.println("InCap = " + InCap);




    }
}
