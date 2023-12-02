package class7;

public class T8LargestNum {
    public static void main(String[] args) {

        int [] num={15,11,12,20,67};
        int max=num[0];

        for(int i=0; i<num.length; i++){
            if(max<num[i]){
                max=num[i];
            }
        }
        System.out.println(max);
    }
}
