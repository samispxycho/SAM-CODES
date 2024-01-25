//index.html
/*
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="aaa" method="get">
		<input type="text" name="naam"> </br></br>
		<input type="text" name="maill"> </br></br>
		<input type="submit" value="Click here"> </br></br>
	</form>
</body>
</html>
*/

//MyServlet.java
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
public class MyServlet2 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
		String name=req.getParameter("naam");
		String email=req.getParameter("maill");
		
		PrintWriter out=res.getWriter();
		out.print("Welcome: "+name);
		out.print("Your mail is: "+email);
	}
}
*/