package day03_sequences_Variables;

import java.util.jar.JarOutputStream;

public class EscapeSequences {
    public static void main(String[] args) {
        System.out.println("Hello Everyone \nMy name is Cybertek");
        System.out.println("\tIm in Virginia\n");
        System.out.println("\n\n\t\t\tI love programming");

        System.out.println("\\"); // this prints me one back slash
        System.out.println("/"); // this prints me one front slash

        System.out.println("\\\\"); // this prints me two back slash
        System.out.println("//"); // this prints me two front slash

        System.out.println("My name is \'Anara\'"); // 'Anara'
        System.out.println("My name is 'Anara'"); // 'Anara'

        System.out.println("My favorite TV-series: \"Game of Thrones\"");




    }
}
