package class8;

import java.util.Scanner;

public class Repl {
    public static void main(String[] args) {

        int [] num=new int[5];
        Scanner sc=new Scanner(System.in);

        for(int i=0; i<num.length; i++){
            num[i]=sc.nextInt();
            System.out.println(num[i]*10);
        }
    }
}
