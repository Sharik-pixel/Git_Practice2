package Day23_Arrays;
import java.util.Scanner;
public class Months {

    public static void main(String[] args) {

        String[] month = {"Jan", "Feb", "Masr", "Apr", "May", "Jun", "Jul", "Aug","Sept", "Oct", "Nov", "Dece"};


        Scanner scan = new Scanner(System.in);


        System.out.println("Enter a number 1 ~ 12");
        int n = scan.nextInt();
        System.out.println(month[n-1]);







    }
}
