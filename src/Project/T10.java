package Project;

public class T10 {
    public static void main(String[] args) {
        /*
        Write a program to print out duplicate
         elements from an Array of Strings?
         */

        String [] words={"Sun","Worls","Car","Sun"};

        for(int i=0; i<words.length-1;i++){
            for(int j=i+1; j<words.length;j++){
                if((words[i].equals(words[j])) && (i!=j)){
                    System.out.println("Duplicate elements is "+words[j]);
                }
            }
        }
    }
}
