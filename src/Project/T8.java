package Project;

public class T8 {
    public static void main(String[] args) {
        /*
        Maximum and minimum number in the array?
         */

        int [] nums={12,55,10,80};

        int max=nums[0];
        int min=nums[0];

        for(int d:nums){
            if(d>max){
                max=d;
            }
            for( int n:nums){
                if(n<min){
                    min=n;
                }
            }
        }

        System.out.println("Maximum number is "+max);
        System.out.println("Minimum number is "+min);


    }
}
