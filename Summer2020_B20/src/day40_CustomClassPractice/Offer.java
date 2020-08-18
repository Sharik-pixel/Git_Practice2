package day40_CustomClassPractice;

    /*

    Offer
    Attribute:
    		Salary, Location, hasPTO, isFulTime, WFH, jobTitle, benefit

    Actions:
    	setOfferingInfo
    	getOfferInfo

    MUST use this keyword

     */

public class Offer {

    double salary;
    String state;
    boolean hasPTO;
    boolean isFulTime;
    boolean isWFH;
    String jobTitle;
    boolean hasBenefit;

    public void setOfferingInfo(double salary,String state,boolean hasPTO,boolean isFulTime,boolean isWFH,String jobTitle,boolean hasBenefit) {
        this.salary = salary;
        this.state = state;
        this.hasPTO = hasPTO;
        this.isFulTime = isFulTime;
        this.isWFH = isWFH;
        this.jobTitle = jobTitle;
        this.hasBenefit = hasBenefit;

    }
        public void getOfferInfo(){  //   display the offer info

            System.out.println("==========================================");

            System.out.println("Salary: "+salary );
            System.out.println("Job Title: "+ jobTitle );
            System.out.println("State: "+state );
            System.out.println("===========================");



    }

















}
