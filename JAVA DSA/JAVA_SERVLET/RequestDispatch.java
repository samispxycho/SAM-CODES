//Request dispatcher to internally navigate between pages

//index.html
/*
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="login" method="post">
		<input type="text" name="email1" placeholder="Enter email"> <br><br>
		<input type="password" name="pass" placeholder="Enter password"> <br><br>
		<input type="submit" value="login">
	</form>
</body>
</html>
*/

//MyServlet.java
/*
package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email1");
		String password = req.getParameter("pass");
		
		if(email.equals("sameer@gmail.com") && password.equals("sameer123")) {
			PrintWriter pWriter = resp.getWriter();
			pWriter.print("Password is correct");
		}else {
			RequestDispatcher rd = req.getRequestDispatcher("/index.html");
			rd.forward(req, resp);
		}
	}
}
*/