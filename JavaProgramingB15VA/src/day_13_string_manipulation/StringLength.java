package day_13_string_manipulation;

public class StringLength {
    public static void main(String[] args) {
        String school = "Cybertek School";
        //print number of characters
        System.out.println(school.length());
        //store school length into a int variable - count
        int count =  school.length();
        //Cybertek School is 15 characters
        System.out.println(school + " is "+count+ " characters ");

        String firstName = "Anara";
        String lastName = "Turdumanbetova";
        //count total number of characters for your full name. and assign to variable
        int fullNameCount = firstName.length() + lastName.length();
        System.out.println("fullNameCount = " + fullNameCount);
        System.out.println("fullNameCount = " +(firstName.length() + lastName.length()));

        String password = "cybertek123";
        //check if the password is more than or equals 8 characters.
        //if yes, "Password length matches requirement"
        // if not "Password is too short. needs to be minimum 8 characters"
        if (password.length() >=  8){
            System.out.println("Password length matches requirement");
        }else{
            System.out.println(("Password is too short. needs to be minimum 8 characters"));
        }
        // assign to int variable plength and check if it is 8-16 characters
        int pLength = password.length();

        if(pLength >= 8 && pLength <= 16){
            System.out.println("Password length matches requirement");
        }else{
            System.out.println("Password does not matches the requirement");
        }

        }
    }

