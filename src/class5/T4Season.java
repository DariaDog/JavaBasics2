package class5;

import java.util.Scanner;

public class T4Season {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("What is your birth month?");
        String month=sc.nextLine();

        if(month.equals("March") || month.equals("April") || month.equals("May")){
            System.out.println("Spring");
        }else if(month.equals("June") || month.equals("July") || month.equals("August")){
            System.out.println("Summer");
        }else if(month.equals("September") || month.equals("October") || month.equals("November")){
            System.out.println("Fall");
        }else{
            System.out.println("Winter");
        }
    }
}

