package review1;

public class E3StringConcat {
    public static void main(String[] args) {
        String houseNo="H#295";
        String streetNo="Abc123";
        String state="New York";
        String country="USA";
        String space=" ";
        String completeAddress=houseNo+streetNo+state+country;
        System.out.println(houseNo+space+state+space+state+space+country);
        System.out.println(completeAddress);

    }
}
