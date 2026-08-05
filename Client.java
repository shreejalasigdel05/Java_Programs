import java.rmi.Naming;
import java.util.Scanner;
public class Client {
    public static void main(String args[]){
        try{
            GradeService service=(GradeService) Naming.lookup("rmi://localhost/GradeService");
            Scanner sc=new Scanner(System.in);

            System.out.print("Enter Roll Number: ");
            int roll=sc.nextInt();

            String result=service.getGrade(roll);
            System.out.println(result);
            sc.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    } 
}
