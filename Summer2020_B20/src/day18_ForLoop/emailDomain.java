package day18_ForLoop;
import java.util.Scanner;
/*
3.Write the program that will return the domain of an email address:

			EX:
				input: test@gmail is: gmail
				output: the domain of the email is: gmail

				input: Cybertek@yahoo.com
				output: the domain of the email is: yahoo
 */
public class emailDomain {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String email = scan.next();

    //              01234567
    int index1 = email.indexOf("@");
    int index2 = email.lastIndexOf("."); //14


      String domain = email.substring(index1+1, index2);  // gmail

        System.out.println(domain);

      //  email.substring();




    }
}
