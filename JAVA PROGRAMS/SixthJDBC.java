//To update a table using java program


import java.sql.*;
import java.io.*;
public class SixthJDBC {
    public static void main(String[] args) {
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url="jdbc:mysql://localhost:3306/javaJDBC";
            String username="root";
            String password="LcvR17M@";
            Connection con=DriverManager.getConnection(url, username, password);

            String q="update table1 set tname=?, tcity=? where tid=?";
            PreparedStatement pstmt=con.prepareStatement(q);

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the id where you want to make changes: ");
            int id=Integer.parseInt(br.readLine());
            System.out.print("Enter new name: ");
            String name=br.readLine();
            System.out.print("Enter new city: ");
            String city=br.readLine();

            pstmt.setString(1, name);
            pstmt.setString(2, city);
            pstmt.setInt(3,id);

            pstmt.executeUpdate();
            System.out.println("Changes made");
            con.close();

        }catch(Exception e)
        {
            System.out.println("Exception occured: "+e);
        }
    }
}
