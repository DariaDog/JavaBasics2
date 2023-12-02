package class9;

public class T6EvenOddNum {
    public static void main(String[] args) {

        int[][] nums = {
                {10,11,12,13},
                {40,41,42,43},
                {78,79,80,81}
        };

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if(nums[i][j]%2==0)
                System.out.print(nums[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println();



        }
    }
