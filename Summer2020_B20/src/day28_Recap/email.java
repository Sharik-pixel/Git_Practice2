package day28_Recap;

    /*

    3. 	 write a program thaat can get the name  and domain  of any  givsen email address
    Ex:
	    cybertek@gmail.com

	    output:
		    name: cybertek

		    domain: gmail
     */

public class email {

    public static void main(String[] args) {
    String email = "cybertek.School@gmail.com";

    String name = email.substring(0, email.indexOf("@"));
    String domain = email.substring(email.indexOf("@")+1, email.lastIndexOf(".") );

        System.out.println(name);
        System.out.println(domain);
    }
}
