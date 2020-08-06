package day19_ForLoop;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

/*
1. write the program that can print all yhe ODD numbers between
 0 ~ 100 that can be divisible by 3 & 5.

2. write the program that can print all yhe EVEN numbers between
 0 ~ 100 that can be divisible by 3 & 5.

 */
public class OddEven {
    public static void main(String[] args) {
      //  task01
        // i: 1 3 5 7 9 11 13 15 17 19 21 ... 99
        for (int i = 1; i <= 99; i += 2) {

            if (i % 5 == 0 && i % 3 == 0) {
                System.out.print(i + " ");
            }
        }

            System.out.println();


            for (int i = 0; i <= 100; i++) {
                if (i % 2 != 0) { // pre:   MUST be OOD numbers
                    if (i % 5 == 0 && i % 3 == 0) { // sub: MUST be divisible by 3%5
                        System.out.println(i + " ");
                    }

                }
            }
                System.out.println();
                System.out.println("====================");

                // Task02:

                // i:  0 2 4 6 8 10 ...100

         for(int i = 0; i <= 100; i+=2) {

            if(i % 5 == 0 && i % 3 == 0){
                System.out.print(i + " ");
            }


         }

        System.out.println();


         for(int i = 0; i <= 100; i++){

             if( i % 2 == 0){ // pre: MUST be ODD number
                 if(i % 3 == 0 && i % 5 == 0){ // sub: MUST be divisible 3 & 5
                     System.out.print(i+" ");


                 }

             }

         }
        System.out.println();

            }



        }










