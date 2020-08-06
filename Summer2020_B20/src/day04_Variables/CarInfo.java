package day04_Variables;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

/*
Task:
	create a class called CarInfo
				Year
				Brand
				Model
				Mileage
				Price

				Print the info of the car

				Ex:
				   2020
				   BMW
				   X5
				   30000
				   45000

				   output:
				         2020 BMW X5, 3000 mileage, 45000 $

 */
public class CarInfo {
    public static void main(String[] args) {

        int year = 2019;
        String brand = "Nonda";
        String  model = "Civic";
        int mileage = 60000;
        double price =  35000.50;
        String color = "Black";

        System.out.println(year + " " +brand +" " + model+" "+color+", "+mileage+ " miles, $"+price);









    }
}
