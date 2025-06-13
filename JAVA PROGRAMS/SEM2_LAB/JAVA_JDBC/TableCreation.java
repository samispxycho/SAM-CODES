package SEM2_LAB.JAVA_JDBC;
import java.sql.*;

public class TableCreation {
    public static void main(String[] args) {
        try{

            Class.forName("com.mysql.jdbc.Driver");

            String url="jdbc:mysql://localhost:3306/anime";
            String user="root";
            String pass="LcvR3NS@";
            Connection conn=DriverManager.getConnection(url,user,pass);

            if(conn.isClosed())System.out.println("Connection is closed");
            else System.out.println("Connection established");

            String query="create table opwaifus(sno int(10) primary key, sname varchar(30) not null)";
            Statement stmt=conn.createStatement();
            stmt.executeUpdate(query);

            System.out.println("Table created successfully");


        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
