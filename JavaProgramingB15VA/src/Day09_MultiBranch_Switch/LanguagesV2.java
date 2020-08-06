package Day09_MultiBranch_Switch;

public class LanguagesV2 {
    public static void main(String[] args) {
        String language = "";
        String greeting = "";
        int option = 3;
        if (option == 1){
            language = "English";
            greeting = "Hello!";
        }else if(option == 2) {
            language = "Espaniol";
            greeting = "Holla!";
        }else if(option == 3) {
            language = "Frence";
            greeting = "Bonjour!";
        }else if(option ==4) {
            language = "Arabia";
            greeting = "Salam!";
        }else if(option == 5) {
            language = "Ruskiy";
            greeting = "Privet!";
        }else if(option == 6) {
            language = "Turkce";
            greeting = "Merhaba!";
        }else {
            language = "L'Italiano";
            greeting = "Ciao!";
        }
        System.out.println(language +" : "+greeting);
    }
}
