package day19_ForLoop;

/*
5. write the program that will print out all letters in ENGLISH ALPHABET IN ascENDING ORDER
 write the program that will print out all letters in ENGLISH ALPHABET IN descending ORDER

 */

public class Characters_A_Z {
    public static void main(String[] args) {

        for(char ch = 'A'; ch <='Z'; ch++){
            // Task05:
            System.out.print(ch+" ");
        }

        System.out.println();

        for(int i = 65; i <= 122; i++){
            char ch = (char) i;
            System.out.print( (char)i + " ");

    }

        System.out.println();
        System.out.println("===================");

     // task06:
        for(char ch = 'Z'; ch >= 'A'; ch--){
            System.out.print(ch+ " ");
        }

        System.out.println();

    for(int i = 90; i >= 65; i--){
        System.out.print( (char)i +" ");
    }

        System.out.println();


        System.out.println("===================");
/*
        for(int i = 0; i < 6500; i++){
            System.out.print( (char) i + " ");
        }

*/




    }
}
