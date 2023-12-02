package class4;

import java.util.Scanner;

public class T2Loan {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("What is the amount of loan do you need?");
        double loan=sc.nextDouble();

        if(loan<=200.000){
            System.out.println("You can get this loan");
        }else{
            System.out.println("Sorry, you can't take a loan");
        }
    }
}
