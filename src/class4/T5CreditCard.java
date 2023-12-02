package class4;

import java.util.Scanner;

public class T5CreditCard {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Do you have a credit card?");
        String card=sc.next();


        if(card.equals("Yes")){
            System.out.println("Congratulation");
            System.out.println("What balance in your card?");
            double balance=sc.nextDouble();

            if(balance>1000){
                System.out.println("Pay off immediately");
            }else{
                System.out.println("You can spend more");
            }
        } else if (card.equals("No")) {
            System.out.println("You can apply for a credit card");
        }
    }
}
