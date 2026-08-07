//4. Write a Java program to find the largest among four numbers using the conditional (ternary) operator.
import java.util.Scanner;
public class Largest2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a=sc.nextInt();
        System.out.println("Enter the second number: ");
        int b=sc.nextInt();
        System.out.println("Enter the third number: ");
        int c=sc.nextInt();
        System.out.println("Enter the fourth number: ");
        int d=sc.nextInt();
        int largest = (a>b)?((a>c)?((a>d)?a:d):(a>c)?a:c):((b>c)?((b>d)?b:d):((c>d)?c:d));
        System.out.println("The largest number is "+largest);
        sc.close();
    }
}


