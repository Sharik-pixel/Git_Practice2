package SelfPractice;

import java.util.Scanner;

public class my {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int inputSeconds,hours,minutes,seconds;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter seconds:");

        inputSeconds = scanner.nextInt();

        hours = inputSeconds / 3600;
        int remainingSecondsAfterHour = inputSeconds % 3600;
        minutes = remainingSecondsAfterHour / 60;
        seconds = remainingSecondsAfterHour % 60;

        System.out.println( hours + " hours, "+ minutes + " minutes, and "+ seconds + " seconds");
    }
}
