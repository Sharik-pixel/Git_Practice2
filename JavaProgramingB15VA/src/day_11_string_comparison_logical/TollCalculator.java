package day_11_string_comparison_logical;

public class TollCalculator {
    public static void main(String[] args) {
        String vehicleType = "car";
        boolean isRushHour = true;

        double tollPrice = 0;
        // "car" and no rushHour --> 3.0
        if(vehicleType.equalsIgnoreCase("CAR") && !isRushHour==false){
            tollPrice = 3.0;
            System.out.println("VehicleType: Car. Non-Rus hour");
        }else if(vehicleType.equalsIgnoreCase("car") && isRushHour){
            tollPrice = 7.50;
            System.out.println("VehicleType: Car. Rush hour");
        }else if(vehicleType.equalsIgnoreCase("truck") && !isRushHour==false){
            tollPrice = 4.75;
            System.out.println("VehicleType: Truck. Non-Rush hour");
        }else if(vehicleType.equalsIgnoreCase("truck") && isRushHour){
            tollPrice = 11.50;
            System.out.println("VehicleType: Truck. Rush hour");
        }else{
            System.out.println("Vehicle not recognized, use a different road");
        }

        System.out.println("Toll cost: $"+tollPrice);
    }
}
