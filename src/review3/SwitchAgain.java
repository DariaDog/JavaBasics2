package review3;

public class SwitchAgain {
    public static void main(String[] args) {

        char choice='y';

        switch(choice){
            case 'y': //this logical operator won't work || 'Y'
                System.out.println("Means Yes");
                break;
            case 'n':
                System.out.println("Means No");
                break;
            case 'm':
                System.out.println("Means Maybe");
                break;
            default:
                System.out.println("I do not understand you");
        }
    }
}
