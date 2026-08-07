//3. Write a Java program to find the factorial of a positive number using recursion.
import java.util.Scanner;
public class factorial {
    public int fact(int n){
        if(n==0|n==1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
    public static void main(String[] args){
        factorial f=new factorial();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to find factorial: ");
        int a= sc.nextInt();
        if(a<0){
            System.out.println("No factorial for negative number.");
        }
        else{
            System.out.println("Factorial of "+a+":"+f.fact(a));
        }
    }
}
