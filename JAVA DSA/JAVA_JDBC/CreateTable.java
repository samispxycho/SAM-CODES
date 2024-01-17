package JAVA_JDBC;
import java.sql.*;

public class CreateTable {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");

            String url="jdbc:mysql://localhost:3306/jdbc_java";
            String user="root";
            String pass="LcvR3NS@";

            Connection conn = DriverManager.getConnection(url, user, pass);

            String query = "create table student(sid int(20) primary key, sname varchar(20) not null, sphone int(10), sremark varchar(50))";

            Statement stmt = conn.createStatement();

            stmt.executeUpdate(query);

            System.out.println("Table created");


        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
