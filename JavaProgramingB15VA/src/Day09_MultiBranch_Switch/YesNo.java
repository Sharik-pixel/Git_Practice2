package Day09_MultiBranch_Switch;

public class YesNo {
    public static void main(String[] args) {
        char yn = 'N';
        boolean isAgreed;

        if(yn =='Y'){
            isAgreed = true;
        }else{
            isAgreed = false;
        }
        System.out.println("Agreed is " + isAgreed);
    }
}
