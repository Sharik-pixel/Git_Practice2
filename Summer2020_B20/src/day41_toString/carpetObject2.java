package day41_toString;

import java.util.ArrayList;
import java.util.Arrays;

public class carpetObject2 {
    public static void main(String[] args) {
        Carpet[] carpets = {new Carpet() , new Carpet(), new Carpet(), new Carpet(), new Carpet() };
        //                          0               1           2               3           4
        carpets[0].customOrder(4.5, 3.5,17.5,false);
        carpets[1].customOrder(5.5,5.7,17.5,true);
        carpets[2].customOrder(2.3,4.5,15.5,true);
        carpets[3].customOrder(4.5,6.5,17.5,true);
        carpets[4].customOrder(3.4,4.3,13.5,false);

/*


        for(Carpet each  : carpets){
            each.getCarpetInfo();


 */


        ArrayList<Carpet> persianCarpets = new ArrayList<>();
        persianCarpets.addAll( Arrays.asList(carpets) );  // add all the carpets
        persianCarpets.removeIf( p -> !p.isPersian );  // removing the carpets that are not persian


        ArrayList<Carpet> regularCarpets = new ArrayList<>();
        regularCarpets.addAll( Arrays.asList(carpets) );  // add all the carpets
        // regularCarpets.removeIf( p -> p.isPersian); // removing the carpets that are is persian
        regularCarpets.removeAll( persianCarpets );

        System.out.println("Number of persian Carpets: "+persianCarpets.size());
        System.out.println("Number of regular carpets: "+regularCarpets.size());





    }

}
