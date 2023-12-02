package class4;

public class LargestNumber {
    public static void main(String[] args) {
        int num1 = 200;
        int num2 = 300;
        int num3 = 100;

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("num1 is largest " + num1);
            }
        } else {
            if (num2 > num3) {
                System.out.println("Num2 is largest " + num2);
            } else {
                System.out.println("Num3 is largest " + num3);
            }


        }
    }
}
