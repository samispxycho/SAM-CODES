//sendRedirect() method

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
    	<input type="text" name="search" placeholder="Enter what to search">
    	<input type="submit" value="submit" name="sub">
    </form>
</body>
</html>
*/

//MyServlet.java
/*
package in.sp.backend;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("mylogin")
public class Login extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String search = req.getParameter("search");
		
		resp.sendRedirect("https://www.google.com/search?q="+search);
	}
}
*/
