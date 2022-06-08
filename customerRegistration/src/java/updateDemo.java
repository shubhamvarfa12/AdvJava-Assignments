import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class updateDemo extends HttpServlet
{
	public void doGet(HttpServletRequest Request, HttpServletResponse Response) throws IOException ,ServletException
	
	{
		PrintWriter out = Response.getWriter();
		
		out.println("<html>");
		out.println("<body>");

		out.println("<head><link rel='stylesheet' href = 'style.css'/></head><body>"
                        + "<div id='mymenu'><ul><li><a href ='MenuDemo'>Home</li></a><li>"
                        + "</li></a><li><a href = 'displayAll'>DisplayAll</li></a>"
                        + "<li><a href = 'updateDemo'>Update</li></a><li><a href = 'LogoutDemo'>Logout</li></a>"
                        + "</ul></div><center><form action='updateDemo'>"
                        + "<table><tr><td>enter Party ID </td><td> <input type='text' placeholder='enter roll no' name='u1'>"
                        + "</td></tr><tr><th colspan='2'><input type='submit' class='B' value='search'></th></tr></div></table>"
                        + "</form></center>");
                out.println("</table>");
		
                try
	    {
		 Class.forName("com.mysql.cj.jdbc.Driver"); 
			String db_ur1="jdbc:mysql://localhost:3306/Sqlassignment?useSSL=false";
			String db_uname="root";
			String db_upass="Root";
			Connection con=DriverManager.getConnection(db_ur1,db_uname,db_upass);
			Statement st=con.createStatement(); 
			
	ResultSet rs = st.executeQuery("select * from Party");
	out.println("<center>");
        out.println("<table cellspacing='30'>");
	
	out.println("<tr>");
	out.println("<td> Rollno</td>");
	out.println("<td> UName</td>");
	out.println("<td> Phy</td>");
	out.println("<td> Che</td>");
	out.println("<td> Maths</td>");
	out.println("</tr>");
	
	while(rs.next())
	{
	out.println("<tr>");
	out.println("<td>"+rs.getString(1)+"</td>");
	out.println("<td>"+rs.getString(2)+"</td>");
	out.println("<td>"+rs.getString(3)+"</td>");
	out.println("<td>"+rs.getString(4)+"</td>");
	out.println("<td>"+rs.getString(5)+"</td>");
	out.println("</tr>");
	}
	out.println("</table>");
        out.println("</center>");
	
        con.close();        
            }     
           catch(Exception e1)
	   {
		  out.println(e1);
	   }     
//      .......................................................................           
                    String s=Request.getParameter("u1");
                try
                {
		    Class.forName("com.mysql.cj.jdbc.Driver"); 
			String db_ur1="jdbc:mysql://localhost:3306/Sqlassignment?useSSL=false";
			String db_uname="root";
			String db_upass="Root";
			Connection con=DriverManager.getConnection(db_ur1,db_uname,db_upass);
			Statement st=con.createStatement();
	
	ResultSet rs = st.executeQuery("select * from party where firstName ='"+s+"'");
	if(rs.next())
	{
//                    out.println("<h1>"+s+"<h1>");
        
	out.println("<center>");
	out.println("<form action = 'updateD'>");
	
        out.println("<table cellspacing='30'>");

	out.println("<tr>");
	out.println("<tr><td>roll no = "+rs.getString(1)+"<td></tr>");
	out.println("<tr><td>user First name<input type = 'text' value = "+rs.getString(2)+" name='u1'/><td></tr>");
	out.println("<tr><td>user Last name<input type = 'text'  value = "+rs.getString(3)+" name='u2'/><td></tr>");
	out.println("<tr><td>Address<input type = 'text' value = "+rs.getString(4)+" name='u3'/><td></tr>");
	out.println("<tr><td>City<input type = 'text' value = "+rs.getString(5)+" name='u4'/><td></tr>");
	out.println("<tr><td>Zip<input type = 'text' value = "+rs.getString(6)+" name='u5'/><td></tr>");
        out.println("<tr><th colspan='2'><input type='submit' class='B' value='update'></th></tr></form>");

        }
	RequestDispatcher rd=Request.getRequestDispatcher("");
			rd.include(Request,Response);
	con.close();
	 }
	   catch(Exception e1)
	   {
		  out.println(e1);
	   }
}
}