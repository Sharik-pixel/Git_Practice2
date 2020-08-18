package day41_toString;

import java.util.ArrayList;
import java.util.Arrays;

public class CatObject2 {

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.setCatInfo("Cass",11, 'F',"Black", "Persian");

        System.out.println(cat1);

        System.out.println("=====================================================");

        Cat[]catPark = { cat1, new Cat(),new Cat(),new Cat(),new Cat(),new Cat() };

        catPark[1].setCatInfo("Petya", 3, 'F', "black","Iran") ;
        catPark[2].setCatInfo("Knopka", 1, 'M', "white","Tiger") ;
        catPark[3].setCatInfo("Tochka", 5, 'F', "black","Sweden") ;
        catPark[4].setCatInfo("Myau", 4, 'M', "grey","Japan") ;
        catPark[5].setCatInfo("Vasya", 32, 'F', "black","Persian") ;

        ArrayList<Cat> femaleCats = new ArrayList<>();
        femaleCats.addAll( Arrays.asList(catPark) );
        femaleCats.removeIf(p -> p.gender == 'M');


        ArrayList<Cat> maleCats = new ArrayList<>();
        maleCats.addAll( Arrays.asList(catPark) );
        // maleCats.removeAll(femaleCats);
        maleCats.removeIf(p -> p.gender == 'F');


        System.out.println("Number of femail cats: "+femaleCats.size() );
        System.out.println("Number of mail cats: "+maleCats.size() );

    }
}
