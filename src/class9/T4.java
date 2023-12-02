package class9;

public class T4 {
    public static void main(String[] args) {

        String[][] cars = {
                {"american","german","korean","italian"},
                {"ford","audi","kia","ferrari"}
                 };

        for (int row = 0; row < cars.length; row++) {
            for (int j = 0; j < cars[row].length; j++) {
                System.out.print(cars[row][j] + " ");

            }
            System.out.println();
        }
        System.out.println();

        for (String[] n : cars) {
            for (String col : n) {
                System.out.print(col + " ");
            }
            System.out.println();
        }


    }
}