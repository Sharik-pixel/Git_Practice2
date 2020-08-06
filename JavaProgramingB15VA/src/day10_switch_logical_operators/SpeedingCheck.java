package day10_switch_logical_operators;
/*
    If currentSpeed is more than 90
	"Jail Time"
    Else if currentSpeed is more than 80
	"Recless Driving"
    Else if currentSpeed is more than 70
	"Speeding Ticket and points"
    Else if currrentSpeed is more than 60
	"WARNING"
    Else
    "Keep driving and thinking Java"
 */
public class SpeedingCheck {
    public static void main(String[] args) {
        int currentSpeed = 66;

        if(currentSpeed>90){
            System.out.println("JailTime");
        }else if(currentSpeed>80){
            System.out.println("ReclessDriving");
        }else if(currentSpeed>70){
            System.out.println("SpeedingTicketandpoints");
        }else if(currentSpeed>60){
            System.out.println("Warning");
        }else {
            System.out.println("KeepdrivingandthinkingJava");

        }
}

}
