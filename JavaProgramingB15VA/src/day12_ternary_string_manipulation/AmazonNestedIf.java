package day12_ternary_string_manipulation;

public class AmazonNestedIf {
    public static void main(String[] args) {
        boolean isPrimeMember = false;
        double totalOrderPrice = 29.45;

        if(isPrimeMember){
            System.out.println("Eligible for Free shipping");
        }else{
            if(totalOrderPrice >= 25.0){
                System.out.println("eligible for Free Shipping");
            }else{
                System.out.println("not elugible for Free Shipping");
            }
        }
    }
}
