//exception handling
public class Demo{
    static void checkAge(int age){
        if(age<18){
            throw new ArithmeticException("You're not eligible to vote.");
        }
        else{
            System.out.println("You can vote");
        }
    }
    public static void main(){
        try{
            System.out.println("Checking age....");
            checkAge(20);
        }
        catch(ArithmeticException e){
            System.out.println("Exception caught: "+e.getMessage());
        }
        finally{
            System.out.println("This block always executes.");
        }
        System.out.println("Program ended.");
    }
}
