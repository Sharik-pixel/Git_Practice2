package day_05_practice_scanner_math;

public class speedCheck {
    public static void main(String[] args) {
        int speedLimit = 55;
        int currentSpeed = 100;
        int overSpeeding = currentSpeed - speedLimit;
        System.out.println("speedLimit = " + speedLimit);
        System.out.println("currentSpeed = " + currentSpeed);
        System.out.println("overSpeeding = " + overSpeeding);

        System.out.println("=======================");

        System.out.println("your current speed is " + currentSpeed + "mph. but speed limit is " +
                speedLimit + "mph. and you are over speeding by " + overSpeeding + " mph");

        System.out.println(speedLimit + " " + currentSpeed);


    }
}
