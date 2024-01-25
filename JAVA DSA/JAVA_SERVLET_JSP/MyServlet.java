
//THESE FILES ARE ONLY FOR REFERENCES, WORKING CODE AVAILABLE IN ECLIPSE

// First File-MyServlet.java that will be created inside Java Resources-->src/main/jav
/*
package in.sp.backend;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/aaa")
public class MyServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException, IOException{
		System.out.println("Im on server"); //FOR DISPLAYING IN CONSOLE
		
		PrintWriter out=res.getWriter();    //FOR DISPLAYING IN BROWSER
		out.print("I am in browser");
	}
}
*/

//Second file-index.html that will be created inside src-->main-->webapp-->WEB_INF
/*
    <!DOCTYPE html>
    <html>
    <head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
    </head>
    <body>
	    <a href="aaa">Click me</a>
    </body>
    </html>
 */