package Day09_MultiBranch_Switch;

public class Citizens {
    public static void main(String[] args) {
        String citizenType = "";//empty string
        int age = 37;

        if(age >= 65){
            citizenType = "Senior";
        }else{
            citizenType = "Non-Senior";
        }
        System.out.println("Citizen Type is "+citizenType);
    }
}
