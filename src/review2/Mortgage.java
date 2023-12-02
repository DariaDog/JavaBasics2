package review2;

public class Mortgage {
    public static void main(String[] args) {

        double rate=4.0;
        int price=85000;

        if(rate>4.5) {
            System.out.println("You will not buy a house");
        }else{
            System.out.println("You will consider buying");
            if(price>100000){
                System.out.println("You will take a loan");
            }else{
                System.out.println("You will pay cash");
            }
        }
    }
}
