package SEM2_LAB.ONE_NIGHT_B4_SEMS;
import java.sql.*;

public class trash6 {
    public static void main(String[] args) {
        
        try{

            Class.forName("com.mysql.jdbc.Driver");

            String url="jdbc:mysql://localhost:3306/anime";
            String user="root";
            String pass="LcvR3NS@";
            Connection conn=DriverManager.getConnection(url, user, pass);

            if(conn.isClosed())System.out.println("Connection not made");
            else System.out.println("Connection established");

            String query1="insert into opwaifus values(4,'yamato')";

            Statement stmt=conn.createStatement();
            stmt.executeUpdate(query1);
            System.out.println("Value entered");

            String query2="select * from opwaifus";
            ResultSet set=stmt.executeQuery(query2);

            while(set.next()){
                int id=set.getInt(1);
                String name=set.getString(2);

                System.out.println(id+"  "+name);
            }

        }catch(Exception e){
            System.out.println(e);
        }


    }
}
