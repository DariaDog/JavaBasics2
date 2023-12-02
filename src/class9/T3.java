package class9;

public class T3 {
    public static void main(String[] args) {

        String[][] names = {
                {"Julia","Teo","John","Jenny"},
                {"A","B","C","A"}
                 };

        for (int row = 0; row < names[0].length; row++) {
            if(names[1][row].equals("A")||names[1][row].equals("B"))
            System.out.println(names[0][row]+" "+names[1][row]);

        }


    }
}