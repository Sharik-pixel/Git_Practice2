package day34_WrapperClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class warmup {

    /*

    1. Use the LocalDate & Time get the current date and time in the following format:

     */
    public static void main(String[] args) {

        DateTimeFormatter dft = DateTimeFormatter.ofPattern("EEEE, hh:mm a, MMM/dd/yyyy");

        LocalDateTime  today = LocalDateTime.now();

        System.out.println(today);
        System.out.println(today.format(dft));








    }
}
