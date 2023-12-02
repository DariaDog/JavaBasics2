package class10;

public class PhoneTester {
    public static void main(String[] args) {

        Phone phone1=new Phone();

        phone1.model="IPhone15";
        phone1.company="Apple";
        phone1.price=1600;
        phone1.memory="1Tb";

        System.out.println(phone1.model);
        System.out.println(phone1.company);
        System.out.println(phone1.price);
        System.out.println(phone1.memory);

        phone1.call();
        phone1.takePics();

        System.out.println();


        Phone phone2=new Phone();

        phone2.model="Pixel";
        phone2.company="Google";
        phone2.price=800;
        phone2.memory="516";

        System.out.println(phone2.model);
        System.out.println(phone2.company);
        System.out.println(phone2.price);
        System.out.println(phone2.memory);

        phone2.call();
        phone2.takePics();
        phone2.messages();

        System.out.println();

        Phone phone3=new Phone();

        phone3.model="S23";
        phone3.company="Samsung";
        phone3.price=1200;
        phone3.memory="128";

        System.out.println(phone3.model);
        System.out.println(phone3.company);
        System.out.println(phone3.price);
        System.out.println(phone3.memory);

        phone3.call();
        phone3.takePics();

    }


}
