package class10;

public class CarTester {
    public static void main(String[] args) {

        //Create an object from the class

        Car bmw=new Car();

        bmw.make="BMW";
        bmw.model="I7";
        bmw.price=120000;
        bmw.color="Blue";

        bmw.drive();
        bmw.honk();
        bmw.applyBrake();


    }
}
