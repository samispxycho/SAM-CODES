//Transferring data using post

//index.html
/*
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="zzz" method="post">
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

@WebServlet("/zzz")
public class PostServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("naam");
		String pass = req.getParameter("pass");
		
		PrintWriter pWriter = resp.getWriter();
		pWriter.print("Login successfull, your name is: "+name);
		pWriter.print("Your password was also saved: "+pass);
	}
}
*/