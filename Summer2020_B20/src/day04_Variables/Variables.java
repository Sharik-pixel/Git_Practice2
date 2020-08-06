package day04_Variables;
/*
task:
	declare the following variables:
	     String  employeeName
	     int employeeID
	     String  jobTitle
	     int salary
	     char gender (char)
	     boolean isFullTime (boolean)
 */
public class Variables {
    public static void main(String[] args) {
        boolean result1 = true;
        boolean result2 = false;

        System.out.println(result1);
        System.out.println(result2);

     // >, <
     boolean result3 = 10 > 6000;
        System.out.println(result3);

        int a = 300;
        int b = 45;

       boolean result4 =  b < a;
       System.out.println(result4);

       int num1 = 200;
       int num2 = 300;

       // <, >

        System.out.println( num1 > num2);

        boolean r1 = num1 > num2;
        System.out.println(r1);

      int r2= 10 - 3;

      boolean r3 = true;
      boolean r4 = false;

        System.out.println("==============");

        String  employeeName = "Alla"; // "employeeName: " + employeeName
        int employeeID = 1233;
        String  jobTitle = "SDET";
        double salary = 120_000.50;
        char gender = 'F';
        boolean isFullTime = true;

        System.out.println("Employee Name " + employeeName);
        System.out.println("Employee ID is " + employeeID );
        System.out.println("Job Title is " + jobTitle);
        System.out.println("Salary  is " + salary + " USD");
        System.out.println("Gender:   " + gender);
        System.out.println("Is Full Time: " + isFullTime);








    }
}
