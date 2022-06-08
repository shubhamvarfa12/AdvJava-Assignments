import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class MenuDemo extends HttpServlet
{
	public void doGet(HttpServletRequest Request, HttpServletResponse Response) throws IOException ,ServletException
	
	{
		PrintWriter out = Response.getWriter();

               Cookie c[]= Request.getCookies();
              
               HttpSession session= Request.getSession();          
               String s1= (String) session.getAttribute("UserLoginID");
              if(c!=null)
                {
		out.println("<html>");
		out.println("<body>");
		out.println("<link rel='stylesheet' href = 'style.css'/>");
		out.println("</head><body><div id='mymenu'><ul><li><a href ='MenuDemo'>HOME</li></a><li>"
                        + "<a href = 'SearchDemo'>SEARCH</li></a>"
                        + "<li><a href = 'displayAll'>DisplayAll</li></a>"
                        + "<li><a href = 'updateDemo'>UPDATE</li></a>"
                         + "<a href = 'DeleteDemo'>DELETE</li></a>"
                        + "</a><li><a href = 'LogoutDemo'>Logout</li></a>"
                        + "</ul></div><center>");
		out.println("<h1>welcome "+c+"</h1><br>");
		out.println("</center>");
		out.println("</body>");
		out.println("</html>");
		out.close();
                }
                else
                {
                    Response.sendRedirect("login.html");
                }
	}
}