package day14_string_manipulation;

public class ContansEorA {
    public static void main(String[] args) {
        String name = " Pavel";

        if(name.contains("e")||name.contains("a")){
            System.out.println("There is e or a in"+name);
        }else{
            System.out.println("There is not e or a in"+name);
        }
    }
}



