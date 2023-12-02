package Project;

public class T4 {
    public static void main(String[] args) {
        /*
        Create a 2D array of integers.
        Develop a program which will calculate
        the sum of even and odd numbers for that array.
         */

        int [][] nums={
                {12,11,13},
                {55,56,57},
                {3,4,5}
        };



        for (int i = 0; i <nums.length; i++) {
            int sum=0;
            for (int j = 0; j < nums[i].length; j++) {
                sum=sum+nums[i][j];

            }
            System.out.println(sum);


        }

    }
}
