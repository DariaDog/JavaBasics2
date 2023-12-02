package review3;

public class LogicalAnd {
    public static void main(String[] args) {
         boolean rain=true;
         boolean cold=true;

  //for logical && =All condition need to be true to get a TRUE
         if(cold && rain){
             System.out.println("I am staying home");
         }

         boolean messageDisplayed=true;
         String errorMessage="Invalid credentials";
         if(messageDisplayed && errorMessage.equals("Invalid Credentials")){
             System.out.println("test Case passed");
         }else{
             System.out.println("Test Case failed");
         }
    }
}
