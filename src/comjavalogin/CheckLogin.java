package comjavalogin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckLogin extends HttpServlet{
	
	protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException 
	{
	String useremail =req.getParameter("email1");
    String userpass =req.getParameter("pass1");
    
    if(useremail.equals("vandanasinghlko12@gmail.com") &&  userpass.equals("vandana@123")) {
    	
     RequestDispatcher rd= req.getRequestDispatcher("profile.html");
     rd.forward(req, resp);
    }
     
    else {
    	
     RequestDispatcher rd=	req.getRequestDispatcher("loginerror.html");
     
     rd.include(req, resp);
    }
	}

}
