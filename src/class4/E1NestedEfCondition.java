package class4;

public class E1NestedEfCondition {
    public static void main(String[] args) {
        boolean isMainDoorOpened = true;
        boolean isRoom1Opened = false;
        boolean isroom2Opened = true;

        if (isMainDoorOpened) {

            if (isRoom1Opened) {
                System.out.println("We are in Room1");
            } else {
                System.out.println("Room 1 is closed");
            }

            if(isroom2Opened){
                System.out.println("we are in room 2");
            }else{
                System.out.println("room 2 os closed");
            }
        }else{
            System.out.println("Can't enter the house main door is closed");
        }
    }
}
