//Transfer data using get

//index.html
/*
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="mylogin" method="get">
        <input type="text" name="naam" placeholder="Enter Name">
        <input type="password" name="pass" placeholder="Enter password">
        <input type="submit" name="submit" value="Submit"/>
    </form>
</body>
</html>
*/


//Login.java
/*
package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/mylogin")
public class Login extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name =request.getParameter("naam");
		String pass=request.getParameter("pass");
		
		PrintWriter pWriter=response.getWriter();
		pWriter.print("Your name is: "+name);
		pWriter.print("Your password was saved: "+pass);
	}
}
*/