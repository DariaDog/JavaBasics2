package review5;

public class E1Arrays {
    public static void main(String[] args) {
        // Creating the array and initializing it
        int [] numbers={10,25,36,56,80};
        System.out.println(numbers.length);
        System.out.println(numbers[1]);

        for (int i = 0; i <numbers.length/2 ; i++) {
            System.out.println(numbers[i]+" ");


        }
        System.out.println();

        for(int n:numbers){
            System.out.println(n);
        }

    }
}
