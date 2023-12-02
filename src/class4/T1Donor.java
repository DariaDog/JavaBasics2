package class4;

public class T1Donor {
    public static void main(String[] args) {
        int age=19;
        int weight=100;

        if(age>=18){

            if(weight>110){
                System.out.println("You are eligible to donate your blood");
            }else{
                System.out.println("We can't accept you");
            }
        }else{
            System.out.println("You are not eligible to donate");
        }
    }
}
