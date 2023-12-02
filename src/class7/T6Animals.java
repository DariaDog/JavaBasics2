package class7;

public class T6Animals {
    public static void main(String[] args) {

        String [] animals={"Tiger","Monkey","Leo","Cat","Dog"};
        for(int i=0;i<5;i++){
            System.out.print(animals[i]+" ");
        }

        System.out.println();


        String []animals2=new String [5];

        animals2[0]="Tiger";
        animals2[1]="Monkey";
        animals2[2]="Leo";
        animals2[3]="Cat";
        animals2[4]="Dog";

        for(int i=0;i<5;i++){
            System.out.print(animals2[i]+" ");
        }

    }
}
