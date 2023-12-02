package class7;

public class T5Cars {
    public static void main(String[] args) {

        String [] cars={"Lexus","Acura","Toyota","Kia","Honda"};
        for(int i=0;i<5;i++){
            System.out.print(cars[i]+" ");
        }

        System.out.println();


        char []grades=new char [5];

        cars[0]="Lexus";
        cars[1]="Acura";
        cars[2]="Toyota";
        cars[3]="Kia";
        cars[4]="Honda";

        for(int i=0;i<5;i++){
            System.out.print(cars[i]+" ");
        }
    }
}
