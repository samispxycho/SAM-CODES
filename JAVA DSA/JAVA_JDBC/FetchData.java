package JAVA_JDBC;
import java.sql.*;

public class FetchData {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");

            String url="jdbc:mysql://localhost:3306/jdbc_java";
            String user="root";
            String pass="LcvR3NS@";

            Connection conn = DriverManager.getConnection(url, user, pass);

            String query="select * from student";

            Statement stmt = conn.createStatement();

            ResultSet set = stmt.executeQuery(query);

            while(set.next()){
                int id=set.getInt(1);
                String name=set.getString(2);
                int phone=set.getInt(3);
                String remark=set.getString(4);

                System.out.println(id+" "+name+" "+phone+" "+remark);
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
