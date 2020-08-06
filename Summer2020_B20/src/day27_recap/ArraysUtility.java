package day27_recap;

    /*
        sort()
        toString()
        equals()

    */

import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {
    // sort();

    String[] names = {"Odina", "Lilia", "Berk", "Emine"};


        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        int[] score = {80,75,65,110,90,45,56,78};
        Arrays.sort(score);
        System.out.println(Arrays.toString(score));

        System.out.println("Maximum: " + score[score.length-1]);
        System.out.println("Minimu: " + score[0]);


        System.out.println("================================================");
        // equals();
        String[] s1 = {"A", "B", "C"};
        String[] s2 = {"A", "B", "C"};

        System.out.println( Arrays.equals(s1, s2) );


        String[]s3 = {"C","A","B"};
        System.out.println( Arrays.equals(s1, s3)); // false



        String[] a1 = {"C","A","B"};
        String[] a2 = {"B","A","C"}; // false
        System.out.println( Arrays.equals(a1, a2));

        Arrays.sort(a1); // a1:
        Arrays.sort(a2); // a2:

        System.out.println(Arrays.equals(a1, a2)); //



    }
}
