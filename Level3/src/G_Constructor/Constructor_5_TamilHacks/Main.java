package G_Constructor.Constructor_5_TamilHacks;

public class Main {
    public static void main(String[] args) {

        //Printing Default Constructor Values

        Car audi=new Car();
        audi.speed=100;
        audi.color="Red";

        Car bmw =new Car();
        bmw.speed=100;
        bmw.color="Red";

        audi.run();
        System.out.println(audi.color);
        System.out.println(bmw.cc);        //we didnt give bmw here.so it will print default constructor value of car class
    }
}
