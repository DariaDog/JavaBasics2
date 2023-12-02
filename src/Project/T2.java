package Project;

public class T2 {
    public static void main(String[] args) {

        /*
        Create an array of integer values. After the array is created,
        calculate the sum of all stored elements in that array.
         */

        int [] nums={10,20,30,40};

        int sum=0;

        for (int i = 0; i <4 ; i++) {
            sum=sum+nums[i];

        }
        System.out.println(sum);
    }
}
