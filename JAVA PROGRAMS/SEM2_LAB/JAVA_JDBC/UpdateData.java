package SEM2_LAB.JAVA_JDBC;
import java.sql.*;

public class UpdateData {
    public static void main(String[] args) {
        try{

            Class.forName("com.mysql.jdbc.Driver");

            String url="jdbc:mysql://localhost:3306/anime";
            String user="root";
            String pass="LcvR3NS@";
            Connection conn=DriverManager.getConnection(url,user,pass);

            if(conn.isClosed())System.out.println("Connection not made");
            else System.out.println("Connection established");

            String query="update opwaifus set sno=3 where sno=2";
            Statement stmt=conn.createStatement();
            stmt.executeUpdate(query);

            System.out.println("Table Updated");

        }catch(Exception e){
            e.printStackTrace();
        }
    }    
}
