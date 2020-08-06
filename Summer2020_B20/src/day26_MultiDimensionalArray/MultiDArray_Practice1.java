package day26_MultiDimensionalArray;

    /*

    tester: {"Lillia , "Odina", "Cristina", "Elkem"},

    Dev: {"Ahmet", "Erfan", "Roza", "Sarah"}

    SM: {"Nurmamam"}

    PO: {"Nadir"}

    BA: {"Alex" }

    scrumTeam: testers, Deelopers, SM, PO, BA

 */

import java.util.Arrays;

public class MultiDArray_Practice1 {

    public static void main(String[] args) {


        String[] testers = {"Liliia", "Odina", "Cristina", "Elkem"};
        String[] developers = {"Ahmet", "Erfan", "Roza", "Sarah"};
        String[] SM = {"Nurmamet"};
        String[] PO = {"Nadir"};
        String[] BA = {"Alex"};

        String[] testers2 = {"Irene", "Aslan", "Nazar"};

        String[][] scrumTeam = {testers, developers, SM, PO, BA};
        //                        0       1         2    3   4

        System.out.println(Arrays.deepToString(scrumTeam));

        scrumTeam[4][0] = "Adem";
        scrumTeam[1][2] = "Emine";
        scrumTeam[0] = testers2;
        scrumTeam[3][0] = "Zeki";

        System.out.println(Arrays.deepToString(scrumTeam));
        System.out.println("============================================================================");

        for (String[] each : scrumTeam) {  // outer loop
            for (String name : each) {    //  inner loop
                System.out.println(name);
            }
            //  System.out.println(Arrays.toString(each) );

            }

    /*
        [Irene, Aslan, Nazar]
        [Ahmet, Erfan, Emine, Sarah]
        [Nurmamet]
        [Zeki]
        [Adem]

     */

        System.out.println("============================================");

        int [][]scores = { {10,20,30,45}, {60,55,75, 105},{93, 48, 125, 135, 13} };
        //                          0           1                   2
        // print out the numbers that are divisible by 3 or 5

        for(int[] each1DArray : scores){
            for( int eachElement: each1DArray){
                if(eachElement % 3 == 0 || eachElement % 5 == 0 ){
                    System.out.print(eachElement +" ");
                }


            }
        }













            // System.out.println( Arrays.toString(each) );
        }


/*
[Irene, Aslan, Nazar]
[Ahmet, Erfan, Emine, Sarah]
[Nurmamet]
[Zeki]
[Adam]
 */


        //                           0                      1


    }









