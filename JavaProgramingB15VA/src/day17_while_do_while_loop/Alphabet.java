package day17_while_do_while_loop;

public class Alphabet {
    public static void main(String[] args) {
        char letter = 'a'; // letter 'a' 97
    //    letter++; // b
    //    letter++; // c
    //    System.out.println("letter = " + letter); //c

        while(letter <= 'z'){ // 'b' 98
            System.out.print(letter+" ");
            letter++;

        }
        System.out.println("letter = " + letter);
        //print alphabet in reverse
        //letter --; // 'z'
        letter = 'z';
        // char reversed = 'z';
        while(letter >= 'a'){
            System.out.print(letter +" ");
            letter--;


              }
         /*
         A
       AB
       ABC
       ABCD
       ABCDE
       ABCDEF
       .....
          */
        System.out.println();
         String letters = "";
         char l = 'A';
         letters += l;
         l = 'B';
        letters += l;
        System.out.println("letters = " + letters);
         }
    }
