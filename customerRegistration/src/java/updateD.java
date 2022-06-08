import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
import java.sql.*;
public class updateD extends HttpServlet
{
    public void doGet(HttpServletRequest Request,HttpServletResponse Response)  throws IOException,ServletException
	{
		PrintWriter out=Response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<link rel='stylesheet' href='style.css' />");
		out.println("</head>");
		out.println("<body>");

//                String s=Request.getParameter("u");
                String s1=Request.getParameter("u1");
		String s2=Request.getParameter("u2");
		String s3=Request.getParameter("u3");
		String s4=Request.getParameter("u4");
		String s5=Request.getParameter("u5");
	try
		{   Class.forName("com.mysql.cj.jdbc.Driver"); 
			String db_ur1="jdbc:mysql://localhost:3306/Sqlassignment?useSSL=false";
			String db_uname="root";
			String db_upass="Root";
			Connection con=DriverManager.getConnection(db_ur1,db_uname,db_upass);
			Statement st=con.createStatement();
			st.executeUpdate("UPDATE party SET firstName='"+s1+"', lastName='"+s2+"',address='"+s3+"',state='"+s4+"',zip='"+s5+"' ");
			Response.sendRedirect("updateDemo");
		}
		catch(Exception e1)
		{
		  out.println(e1);
		}
		
		out.println("</center>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
}