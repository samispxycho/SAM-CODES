package JAVA_JDBC;
import java.sql.*;

public class ConnectionEs {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");

            String url="jdbc:mysql://localhost:3306/jdbc_java";
            String user="root";
            String pass="LcvR3NS@";

            Connection conn = DriverManager.getConnection(url, user, pass);

            if(conn.isClosed()){
                System.out.println("Connection is closed");
            }else{
                System.out.println("Connection established");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
