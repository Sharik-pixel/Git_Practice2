package day20_WhileLoops;

public class WhileLoops_Practice2 {
    public static void main(String[] args) {


        int a = 10;

        while(a < 15) {

            System.out.println("Anara");
            a++;


        }
        System.out.println("========================");

        String str = "Cybertek";
        //            01234567

        String result = "";

        int index = str.length() -1;
        while(index >=0){

            result  += str.charAt(index);

            index--;

        }

        System.out.println(result);


    }
}
