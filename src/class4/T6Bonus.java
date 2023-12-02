package class4;

import java.util.Scanner;

public class T6Bonus {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("How many years do you work?");
        int years= sc.nextInt();

        if(years>=5){
            System.out.println("You are eligible for the bonus");
            System.out.println("What your annual salary?");
            double salary= sc.nextDouble();

            if(salary>50000){
                System.out.println("Your bonus will be $5000");
            }else{
                System.out.println("Your bonus will be $3000");
            }
        }else{
            System.out.println("You are not eligible for the bonus");
        }
    }
        }
