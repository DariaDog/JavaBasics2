package Project;

public class T1 {
    public static void main(String[] args) {

        /*
        Create a program that uses an array to store a list of temperatures for a week,
        and then uses a loop to find the highest and lowest temperature for the week.
         */

        int[] temp = {80, 55, 72, 60,77,89,45};

        int max = temp[0];
        int max1=temp[0];

        for (int i = 0; i < temp.length; i++) {
            if (max < temp[i]) {
                max = temp[i];
            }
            for (int j = 0; j < temp.length; j++) {
                if (max1 > temp[i]) {
                    max1 = temp[i];

                }

            }


        }
        System.out.println("The highest temperature for the week is "+max);
        System.out.println("The lowest temperature for the week is "+max1);
    }
}
