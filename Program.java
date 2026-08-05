import java.io.*;
import java.util.*;

public class Program{
    public static void main(String[] args) {
        File myObj=new File("C:\\Users\\SHRIJALA\\Desktop\\notes\\4th sem\\JAVA\\program\\data.txt");
        try(Scanner myReader=new Scanner(myObj)){
            while(myReader.hasNextLine()){
                String data=myReader.nextLine();
                System.out.println(data);
            }
        }catch(FileNotFoundException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}