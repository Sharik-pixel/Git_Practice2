package day39_CustomClass;

public class DogObjects {

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        dog1.setDogInfo("Sharik","Kangal","medium", 2,"Mix");
        dog2.setDogInfo("Roof","Terier","Large", 1, "blue");
        dog3.setDogInfo("Shy","hi","small",2,"white");


        dog1.getDogInfo();
        dog2.getDogInfo();
        dog3.getDogInfo();

        dog1.eat("dog food");
        dog3.eat("Steak");
        dog2.eat("Polo");

        dog3.drink("cola");
        dog1.drink("milk");
        dog2.drink("redbull");


        dog1.sleep();
        dog2.sleep();
        dog3.sleep();



    }



}
