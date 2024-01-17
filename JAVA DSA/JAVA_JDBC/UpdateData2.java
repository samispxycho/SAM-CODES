package JAVA_JDBC;
import java.sql.*;
import java.util.Scanner;

public class UpdateData2 {
    public static void main(String[] args) {
        try{

            Class.forName("com.mysql.jdbc.Driver");

            String url="jdbc:mysql://localhost:3306/jdbc_java";
            String user="root";
            String pass="LcvR3NS@";

            Connection conn = DriverManager.getConnection(url, user, pass);

            String query="update student set sname=?, sphone=? where sid=?";

            Scanner sc= new Scanner(System.in);
            System.out.print("Enter updated sname: ");
            String uname=sc.nextLine();
            System.out.print("Enter updated phone: ");
            int uphone=sc.nextInt();
            System.out.print("Enter the sid where you want to update these changes: ");
            int sidd=sc.nextInt();

            PreparedStatement pstmt=conn.prepareStatement(query);

            pstmt.setString(1, uname);
            pstmt.setInt(2, uphone);
            pstmt.setInt(3, sidd);

            pstmt.executeUpdate();

            sc.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
