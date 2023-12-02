package class4;

public class E2NestedEfCondition {
    public static void main(String[] args) {

        double budget=25000;
        String engyneType="Petrol";
        if(budget>=50000){
            if(engyneType.equals("Electric")){
                System.out.println("I want to Buy a tesla");
            }else if(engyneType.equals("Hybrid")){
                System.out.println("I want to buy a Toyota");
            }else{
                System.out.println("I want to buy a Porsche");
            }
        }else if (budget>=30000){
            if(engyneType.equals("Electric")){
                System.out.println("I want to buy BYD");
            } else if (engyneType.equals("Hybrid")) {
                System.out.println("I want to buy Camry");
            }else{
                System.out.println("Hyundai Sonata");
            }
        } else if (budget>=20000) {
            if(engyneType.equals("Electric")){
                System.out.println("nissan leaf");
            } else if (engyneType.equals("Hybrid")) {
                System.out.println("Kia");
            }else{
                System.out.println("honda civic");
            }
        }else{
            System.out.println("Let's save more");
        }
    }
}
