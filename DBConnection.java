import java.sql.*;
public class DBConnection {
    private static final String url="jdbc:mysql://localhost:3307/collegeDB";
    private static final String user="root";
    private static final String password="";
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con=DriverManager.getConnection(url,user,password);

            String query="SELECT * FROM students";
            Statement s=con.createStatement();
            ResultSet r=s.executeQuery(query);

            System.out.println("Sutdent Details");
            while(r.next()){
                System.out.println("ID: "+r.getInt("ID"));
                System.out.println("Name: "+r.getString("Name"));
                System.out.println("Course: "+r.getString("Course"));
                System.out.println();
            }
            r.close();
            s.close();;
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
