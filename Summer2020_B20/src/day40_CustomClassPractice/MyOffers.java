package day40_CustomClassPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {


    public static void main(String[] args) {
        Offer offer1 = new Offer();
        Offer offer2 = new Offer();
        Offer offer3 = new Offer();
        Offer offer4 = new Offer();
        Offer offer5 = new Offer();
        Offer offer6 = new Offer();
        Offer offer7 = new Offer();

        offer1.setOfferingInfo(100000, "VA",true ,true,true,"SDET",true) ;
        offer2.setOfferingInfo(750000,"NY",true,true,true,"SDET",true) ;
        offer3.setOfferingInfo(234556,"CA",true,true,true,"SDET",true) ;
        offer4.setOfferingInfo(123456,"CA", true,true,true,"SDET", true) ;
        offer5.setOfferingInfo( 345678,"NY",true,true,true,"SDET",true);
        offer6.setOfferingInfo(9876123,"NJ",true,true,true,"SDET",true);
        offer7.setOfferingInfo(876543234,"VA", true,true,true,"SDET",true);

        ArrayList<Offer>jobOffers = new ArrayList<>();
        jobOffers.addAll(Arrays.asList(offer1,offer2,offer3) );


        for( Offer eachOffer: jobOffers){
            eachOffer.getOfferInfo() ;
        }

        System.out.println("============");
        // less than 120K:
      //  jobOffers.removeIf( p-> p.salary < 120000);
      //  System.out.println("Number of Offers: "+jobOffers.size() );


        // less than 120K or not from VA area
      //  jobOffers.removeIf(p-> p.salary < 120000 || !p.state.equals("VA") )
     //   System.out.println("Number of Offers: "+ jobOffers.size() );

        // does not have PTO or does not have benefit or is not full time
        jobOffers.removeIf( p -> p.hasPTO == false || p.hasBenefit == false ||p.isFulTime == false ||p.salary < 120000);
        System.out.println("Number of Offers: "+ jobOffers.size() );



    }
}
