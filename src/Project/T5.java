package Project;

public class T5 {
    public static void main(String[] args) {

        /*
        Write a program to swap 2 numbers without a temporary variable?
         */

        int a=10;
        int b=5;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
    }
}
