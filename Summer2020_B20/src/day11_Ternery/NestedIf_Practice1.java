package day11_Ternery;
 /*

precondition: min salary of 30k
            sub condition: min 2 years of job history
  */
public class NestedIf_Practice1 {
     public static void main(String[] args) {

         double salary = 29999;
         double jobHistory = 20;

         if (salary >= 30000) {
             if(jobHistory >= 2) {
                 System.out.println("You are qualified");
             } else { // JobHistory < 2 years
                 System.out.println("You MUST have been on job  at least 2  years");
             }

             }else{
                 System.out.println("You Must earn at least $30k");
             }


         }
     }
