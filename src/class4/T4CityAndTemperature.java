package class4;

import java.util.Scanner;

public class T4CityAndTemperature {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("What city do you live?");
        String city=sc.next();
        System.out.println("What temperature in your city?");

        double temp=sc.nextDouble();
        double tempInCelsius=(temp-32)*5/9.0;


        System.out.println("The temperature in the city "+city+" is "+tempInCelsius);
    }
}
