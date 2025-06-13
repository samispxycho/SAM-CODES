package SEM2_LAB.JAVA_JDBC;
import java.sql.*;

public class EnterData {
    public static void main(String[] args) {
        
        try{

            Class.forName("com.mysql.jdbc.Driver");

            String url="jdbc:mysql://localhost:3306/anime";
            String user="root";
            String pass="LcvR3NS@";
            Connection conn=DriverManager.getConnection(url,user,pass);

            if(conn.isClosed())System.out.println("Connection not made");
            else System.out.println("Connection established");

            String query1="insert into opwaifus values(1,'Robin')";
            String query2="insert into opwaifus values(2,'Nami')";

            Statement stmt=conn.createStatement();
            stmt.executeUpdate(query1);
            stmt.executeUpdate(query2);

            System.out.println("Data entered successfully");

        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
