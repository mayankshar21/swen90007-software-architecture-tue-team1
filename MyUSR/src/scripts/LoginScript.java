package scripts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class LoginScript extends HttpServlet{
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException{
		String userName = request.getParameter("username");
		String passWord = request.getParameter("password");
		
		//TODO check domain object to validate the correct pair
		
		//Dummy test for now
		if (userName.equals("admin") && passWord.equals("admin")) {
			response.sendRedirect("NewFile.jsp");
		}else {
			PrintWriter out = response.getWriter();
			out.print("Wrong combination");
		}
	}
}
