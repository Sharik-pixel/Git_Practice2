package day06_operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        int cars = 15;
        System.out.println("Cars in parking lot: " + cars);//15
        cars = cars + 2;
        System.out.println("Cars in parking lot: " + cars);//17
        cars += 3; //add 3 more to cars
        System.out.println("Cars in parkin lot: " + cars); //20

        cars = cars - 1;
        System.out.println("Cars in parking lot: " + cars);//19

        cars -= 2;
        System.out.println("Cars in parking lot: " + cars);//17

        cars *= 3; //cars = cars *3;
        System.out.println("Cars in parking lot: " + cars);//51

        cars /= 2;//cars = cars / 2;
        System.out.println("Cars in parking lot: " + cars);//25
        //========================
        int carsBack =20;
        cars += carsBack;// cars = cars + CarsBack;
        System.out.println("Cars in parking lot: " + cars);//45
        System.out.println("CarsBack in parking lot: " + carsBack);//20

        String letters = "A";
        System.out.println("Letters: " + letters);

        letters = letters + "B";
        System.out.println("Letters: " + letters);

        letters += "CD";
        System.out.println("Letters: " + letters);
        ///letters -= "CD"; WILL NOT WORKint

        int apples = 10;
                       //3+3+3+1
        apples %= 3;// apples = apples % 3;
        System.out.println("Apple left: " + apples);

        //System.out.println(apples / 0);



    }
}
