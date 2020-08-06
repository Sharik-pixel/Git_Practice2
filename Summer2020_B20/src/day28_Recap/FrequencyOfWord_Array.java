package day28_Recap;

    /*
    2.  write a program that can count  the frequency of a word  from a array of  string

    EX:
	    arr: {"Java", "C#", "Python", "Java"};
	    word: "java"

	    output:
    MUST USE for each loop and continue statement

    */

public class FrequencyOfWord_Array {

    public static void main(String[] args) {

    String[] arr = {"Java", "C#","Python", "Java"};
    String word = "java";

    int count = 0;

    for(String each : arr){
        if(!word.equalsIgnoreCase(each)){
            continue;

        }

        count++;
    }
        System.out.println(count);



    }
}
