package day16_memory_while_loop_intro;

public class SMSMessage {
    public static void main(String[] args) {
                       // 012345678910111211314151617181920
        String message = "Sender: [student], From Number<202433123>, Message:{Hey, whats up! Lets code some Java!}";
        System.out.println("index of [ - "+message.indexOf("["));
        System.out.println("index of ] - "+message.indexOf("]"));
        int startSender = message.indexOf("[")+1;
        int endSender = message.indexOf("]");

        System.out.println(message.substring(startSender, endSender));

        System.out.println(message.substring(message.indexOf("[")+1 , message.indexOf("]")));


        String sender = message.substring(message.indexOf("[")+1 , message.indexOf("]"));
        String fromNumber = message.substring(message.indexOf("[")+1 , message.indexOf("]"));
        String txt = message.substring(message.indexOf("{")+1 , message.indexOf("}"));

        System.out.println("sender = " + sender);
        System.out.println("fromNumber = " + fromNumber);
        System.out.println("txt = " + txt);


    }
}
