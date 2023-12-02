package class4;

import java.util.Scanner;

public class T3DMV {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("What is your age?");
        int age=sc.nextInt();

        if(age>=18){
            System.out.println("You will get a driver license");
        }else{
            System.out.println("You need to get a learners permit");
        }
    }
}
