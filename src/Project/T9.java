package Project;

public class T9 {
    public static void main(String[] args) {
        /*
        Write a java program to find the second largest number in the array?
         */

        int [] num={10,1,5,60};

        int temp=0;

        for(int i=0; i<num.length; i++){
            for (int j =i+1; j <num.length ; j++) {
                if(num[i]>num[j]){
                    temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }
        }
        System.out.println("The second largest number is "+num[num.length-2]);
    }
}
