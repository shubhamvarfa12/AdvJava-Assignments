import java.io.*;
import javax.servlet.*;
import javax.swing.*;
import javax.servlet.http.*;
import java.sql.*;
public class LoginDemo extends HttpServlet
{
	public void doGet(HttpServletRequest Request, HttpServletResponse Response) throws IOException ,ServletException
	{
		PrintWriter out = Response.getWriter();
		out.println("<html>");
		out.println("<body>");
		String s1=Request.getParameter("un");
		String s2=Request.getParameter("up");
		
		try
	   {
		 Class.forName("com.mysql.cj.jdbc.Driver");
			
			String db_ur1="jdbc:mysql://localhost:3306/Sqlassignment?useSSL=false";
			String db_uname="root";
			String db_upass="Root";
			Connection con=DriverManager.getConnection(db_ur1,db_uname,db_upass);
			Statement st=con.createStatement();
			
	ResultSet rs=st.executeQuery("select * from party where userLoginID='"+s1+"' AND password='"+s2+"'");
	if(rs.next())
	{
            
         Cookie ck=new Cookie("userLoginID",s1);   
            ck.setMaxAge(60*60); 
            Response.addCookie(ck);
            
// HttpSession session= Request.getSession();          
// session.setAttribute("userLoginId",s1);
 
	Response.sendRedirect("MenuDemo");
	}
	else 
	{
		out.println("<center style= margin-top:20px><h1>ERROR 404</h1>invalid user name and pass...</center>");
		RequestDispatcher dis = Request.getRequestDispatcher("Login.html");
		dis.include(Request,Response);
	}
	con.close();
	 }           
	   catch(Exception e1)
	   {
		  out.println(e1);
	   }
		
		out.println("</body>");
		out.println("</html>");
		out.close();
		
	}
}
//        position:absolute; right: 500px; top:300px; color:red