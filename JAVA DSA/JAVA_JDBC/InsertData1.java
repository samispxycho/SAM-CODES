package JAVA_JDBC;
import java.sql.*;

public class InsertData1 {
    public static void main(String[] args) {
        try{

            Class.forName("com.mysql.jdbc.Driver");

            String url="jdbc:mysql://localhost:3306/jdbc_java";
            String user="root";
            String pass="LcvR3NS@";

            Connection conn = DriverManager.getConnection(url, user, pass);

            String query="insert into student values(1,'Sameer',8193976,'Excillent')";

            Statement stmt=conn.createStatement();

            stmt.executeUpdate(query);

            System.out.println("Data inserted");


        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
