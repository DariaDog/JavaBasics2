package class9;

public class T8Countries {
    public static void main(String[] args) {

        String [][] countries={
                {"Canada","United States","Greenland"},
                {"Argentina", "Bolivia", "Brazil"},
                {"Russia","Germany","United Kingdom"},
                {"India", "China", "Indonesia"},
                {"Egypt", "Equatorial Guinea"}

        };

        for(int i=0; i<countries.length; i++){
            for(int j=0; j<countries[i].length; j++){
                System.out.print(countries[i][j]+" ");

            }
            System.out.println();

        }
        System.out.println();
        for(String [] row:countries){
            for(String col:row){
                System.out.print(col+" ");
            }
            System.out.println();
        }

        int total=0;
        for(int i=0; i<countries.length; i++){
            total=total+countries[i].length;
        }
        System.out.println(total);
    }
}
