import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Test{
    public static void main(String[] args) throws SQLException{
        String url="jdbc:mysql://localhost:3306/collegedb";
        String username="root";
        String password="";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con=DriverManager.getConnection(url,username,password);
            System.out.println("Connection Established Successfully");

            con.close();
            System.out.println("Connection Closed");
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}