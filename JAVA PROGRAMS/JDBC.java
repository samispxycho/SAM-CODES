import java.sql.*;
import java.util.Scanner;
import java.io.*;

public class JDBC {
    public static void main(String[] args) {
        try
        {
            System.out.println();
            System.out.println("Press 1 to insert values into the table");
            System.out.println("Press 2 to update the data of the table");
            System.out.println("Press 3 to display the data available in the table");
            System.out.println();
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter your choice of operation: ");
            int choice=sc.nextInt();
            System.out.println("\n");

            try
            {
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url="jdbc:mysql://localhost:3306/geminitay";
                String user="root";
                String password="LcvR17M@";
                Connection connection=DriverManager.getConnection(url, user, password);

                switch(choice)
                {
                    case 1:
                    {
                        String query="insert into student(sname,scity,sgrade)values(?,?,?)";
                        PreparedStatement pstmt=connection.prepareStatement(query);
                        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                        System.out.print("Enter how many values you want to enter: ");
                        int num=sc.nextInt();

                        int i=1;
                        while(i<=num)
                        {
                            System.out.print("Enter name of the student: ");
                            String name=br.readLine();
                            System.out.print("Enter the city: ");
                            String city=br.readLine();
                            System.out.print("Enter the student's grade: ");
                            String grade=br.readLine();

                            pstmt.setString(1,name);
                            pstmt.setString(2,city);
                            pstmt.setString(3,grade);

                            pstmt.executeUpdate();
                            System.out.println(i+" values inserted.");
                            i++;
                        }
                        break;
                    }
                    case 2:
                    {
                        String query="update student set sname=?,scity=?,sgrade=? where sid=?";
                        PreparedStatement pstmt=connection.prepareStatement(query);
                        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                        
                        System.out.print("Enter the id to which you want to apply changes: ");
                        int id=Integer.parseInt(br.readLine());
                        System.out.print("Enter the new name: ");
                        String name=br.readLine();
                        System.out.print("Enter the new city: ");
                        String city=br.readLine();
                        System.out.print("Enter the new grade: ");
                        String grade=br.readLine();

                        pstmt.setString(1,name);
                        pstmt.setString(2,city);
                        pstmt.setString(3,grade);
                        pstmt.setInt(4,id);

                        pstmt.executeUpdate();
                        System.out.println("Changes made");

                        break;
                        
                    }
                    case 3:
                    {
                        String query="select * from student";
                        Statement stmt=connection.createStatement();
                        ResultSet set=stmt.executeQuery(query);
                        System.out.println("Please wait while your data is being processed");
                        Thread.sleep(4000);

                        while(set.next())
                        {
                            int id=set.getInt(1);
                            String name=set.getString(2);
                            String city=set.getString(3);
                            String grade=set.getString(4);

                            System.out.println(id+" : "+name+" : "+city+" : "+grade);
                        }
                        break;
                    }
                    default:
                    {
                        System.out.println("Please choose a valid operation");
                    }
                }
                connection.close();

            }catch(Exception e)
            {
                System.out.println("Exception occured: "+e);
            }
            
            


        }catch(Exception e)
        {
            System.out.println("Exception occured: "+e);
        }
    }
}
