package G_Constructor.Constructor_6_Parameterized_TamilHacks;

public class Main {
    public static void main(String[] args) {
    Car audi=new Car();
    audi.color="Red";

    Car bmw=new Car(200,"White");
    //bmw.speed=100;
    //bmw.color="White";

    Car mercedes=new Car(100,200);
    }
}

class Car{
int speed;
String color;
int cc;

    Car(){
        this.speed=0;
        this.color="null";
        this.cc=0;
    }

    Car(int speed,String color){
        System.out.println("Const 2");
    }

    Car(int speed,int cc){
        System.out.println("Const 3");
    }
}