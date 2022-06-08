import java.io.*;
import javax.swing.*;
import javax.servlet.*;
import javax.servlet.http.*;
    
public class LogoutDemo extends HttpServlet

{
	public void doGet(HttpServletRequest Request, HttpServletResponse Response) throws IOException ,ServletException
	
	{
		// HttpSession session=Request.getSession();
                  HttpSession session=Request.getSession();//same work
                  session.invalidate();
//		Cookie ck=new Cookie("uname","");
//            ck.setMaxAge(0);
//            Response.addCookie(ck);
            Response.sendRedirect("Login.html");
		
		
		
	}
}