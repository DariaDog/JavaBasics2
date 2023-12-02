package review2;

public class Degree {
    public static void main(String[] args) {
        boolean degree=true;
        double gpaScore=2.5;

        if(degree){
            System.out.println("Congratulations");
            if(gpaScore>3.5){
                System.out.println("You are eligible for scholarship");
            }else{
                System.out.println("You should have studied harder");
        }
        }else{
            System.out.println("You should get a degree");
        }
    }
}
