package JAVA_JDBC;
import java.sql.*;
import java.util.Scanner;

public class InsertData2 {
    public static void main(String[] args) {
        try{

            Class.forName("com.mysql.jdbc.Driver");

            String url="jdbc:mysql://localhost:3306/jdbc_java";
            String user="root";
            String pass="LcvR3NS@";

            Connection conn = DriverManager.getConnection(url, user, pass);

            String query="insert into student values(?,?,?,?)";

            PreparedStatement pstmt = conn.prepareStatement(query);

            Scanner sc= new Scanner(System.in);
            System.out.print("Enter sid: ");
            int id=sc.nextInt();
            System.out.print("Enter sname: ");
            String name=sc.nextLine();
            System.out.print("Enter sphone: ");
            int phone=sc.nextInt();
            System.out.print("Enter sremark: ");
            String remark = sc.nextLine();

            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.setInt(3, phone);
            pstmt.setString(4, remark);

            pstmt.executeUpdate();
            System.out.println("Values inserted");

            sc.close();

        }catch(Exception e){
           e.printStackTrace(); 
        }
    }
}
