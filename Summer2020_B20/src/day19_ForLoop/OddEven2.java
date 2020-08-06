package day19_ForLoop;
/*
3. print odd numbers between 1 to 50
4. print even numbers between 1 to 50

MUST use continue statement

 */


public class OddEven2 {

    public static void main(String[] args) {

        for(int i = 0; i <= 50; i++){

            if(i % 2 != 0){ // if the number is Odd, then skip
                continue;

            }

            System.out.print(i+" ");

        }

        for(int i = 0; i <= 50; i++){
            if( i % 2 == 0){
                continue;
            }
            System.out.print(i+" ");
        }

    }



}
