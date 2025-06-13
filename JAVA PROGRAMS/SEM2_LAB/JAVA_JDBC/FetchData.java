package SEM2_LAB.JAVA_JDBC;
import java.sql.*;

public class FetchData {
    public static void main(String[] args) {
        try{

            Class.forName("com.mysql.jdbc.Driver");

            String url="jdbc:mysql://localhost:3306/anime";
            String user="root";
            String pass="LcvR3NS@";
            Connection conn=DriverManager.getConnection(url,user,pass);

            if(conn.isClosed())System.out.println("Connection not made");
            else System.out.println("Connection established");

            String query="select * from opwaifus";
            Statement stmt=conn.createStatement();
            ResultSet set=stmt.executeQuery(query);

            while(set.next()){
                int id=set.getInt(1);
                String name=set.getString(2);
                System.out.println(id+" "+name);
            }

            System.out.println("\n\nData printed successfully");

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
