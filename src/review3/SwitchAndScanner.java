package review3;

import java.util.Scanner;

public class SwitchAndScanner {
    public static void main(String[] args) {

        /*
        ask user where he is from and based
        on the country specify favorite food
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter where are you from");
        String country=sc.nextLine();

        switch (country.toLowerCase()){
            case "india":
                System.out.println("You love biryani");
                break;
            case "egypt":
                System.out.println("You love Koshary");
                break;
            case "georgia":
                System.out.println("You love Hachapuri");
                break;
            case "moldova":
                System.out.println("You love Mamaliga");
                break;
            case "kazakhstan":
                System.out.println("You lobe Beshparmak");
                break;
            case "usa":
                System.out.println("You love burger and french fries");
                break;
            case "great britain":
                System.out.println("You love fish and chips");
                break;
            default:
                System.out.println("I don't know your favorite food");
        }
    }
}
