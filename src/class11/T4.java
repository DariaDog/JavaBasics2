package class11;

public class T4 {
    public static void main(String[] args) {
        //Create a String and print it in reverse order (Sunday → yadnuS).

        String word="Sunday";

        for (int i=word.length()-1; i>=0; i--) {
            System.out.print(word.charAt(i));

        }
    }
}
