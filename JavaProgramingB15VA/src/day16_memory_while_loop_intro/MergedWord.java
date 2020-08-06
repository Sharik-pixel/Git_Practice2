package day16_memory_while_loop_intro;

public class MergedWord {
    public static void main(String[] args) {
                    //0123
        String str = "{||}"; //4
        String word = "selenium";
        //{[java]}                       {  [   java               ] }
        System.out.println(str.substring(0, 2) +word+str.substring(2));

        String merged = str.substring(0, 2) +word+str.substring(2);
        System.out.println("merged = " + merged);

    }
}
