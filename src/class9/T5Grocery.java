package class9;

public class T5Grocery {
    public static void main(String[] args) {

        String[][] grocery = {
                {"Cucumber", "Tomato", "Carrot", "Celery"},
                {"Banana", "Strawberry", "Blueberry", "Apple"},
                {"Milk", "Sour Cream", "Yoguts", "Cheese"},
                {"Chocolate", "Ice cream", "Cookie"}
        };

        for (int row = 0; row < grocery.length; row++) {
            for (int j = 0; j < grocery[row].length; j++) {
                System.out.print(grocery[row][j] + " ");

            }
            System.out.println();
        }
        System.out.println();

            for (String[] n : grocery) {
                for (String col : n) {
                    System.out.print(col + " ");
                }
                System.out.println();
            }


        }
    }
