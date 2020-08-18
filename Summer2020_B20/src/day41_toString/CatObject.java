package day41_toString;

import java.util.ArrayList;

public class CatObject {

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

        for( Cat each : catPark ){
            System.out.println(each);
        }

        System.out.println("==================================");

      //  System.out.println(Arrays.toString(catPark) );
      // element, element

        ArrayList<Cat> femaleCats = new ArrayList<>() ;
        ArrayList<Cat> maleCats = new ArrayList<>() ;
    /*
        for( int i = 0; i <= catPark.length-1; i++){
            if( catPark[i].gender == 'M'){
                maleCats.add(catPark[i]);
            }else{
                femaleCats.add(catPark[i]);

            }
        }

    */

    for(Cat each : catPark){
        if( each.gender == 'M'){
            maleCats.add(each);
        }else{
            femaleCats.add(each);
        }
     }

        System.out.println(femaleCats);
        System.out.println(maleCats);
    }

}
