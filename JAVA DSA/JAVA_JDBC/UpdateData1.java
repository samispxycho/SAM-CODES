package JAVA_JDBC;
import java.sql.*;

public class UpdateData1 {
    public static void main(String[] args) {
        try{

            Class.forName("com.mysql.jdbc.Driver");

            String url="jdbc:mysql://localhost:3306/jdbc_java";
            String user="root";
            String pass="LcvR3NS@";

            Connection conn = DriverManager.getConnection(url, user, pass);

            String query="update student set sname='John' , sphone=101 where sid=1";

            Statement stmt = conn.createStatement();

            stmt.executeUpdate(query);

            System.out.println("Values updated");

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
