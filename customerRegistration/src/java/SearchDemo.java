import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class SearchDemo extends HttpServlet {

    public void doGet(HttpServletRequest Request, HttpServletResponse Response) throws IOException, ServletException {
        PrintWriter out = Response.getWriter();

        out.println("<html>");
        out.println("<body>");        
        out.println("<head><link rel='stylesheet' href = 'style.css'/></head><body>"
                + "<div id='mymenu'><ul><li><a href ='MenuDemo'>Home</li></a>"
                + "<li><a href = 'displayAll'>ShowAll</li></a>"
                + "<li><a href = 'Login.html'>Logout</li></a>"
                + "</ul></div><center><form action='SearchDemo'>"
                + "<table><tr><td>Enter First Name </td><td>"
                + "<input type='text' placeholder='Enter First Name' name='u1'></td></tr><br>"
                + "<tr><td>Enter Last Name</td>"
                + "<td><input type='text' placeholder='Enter Last Name' name='u2'></td></tr>"
                + "<tr><th colspan='2'>"
                + "<input type='submit' class='B' value='search'></th></tr></div></table></form></center>");
        out.println("</table>");
        String s1 = Request.getParameter("u1");
        String s2 = Request.getParameter("u2");
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String db_ur1 = "jdbc:mysql://localhost:3306/Sqlassignment?useSSL=false";
            String db_uname = "root";
            String db_upass = "Root";
            Connection con = DriverManager.getConnection(db_ur1, db_uname, db_upass);
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("select * from party where firstName ='" + s1 + "' and lastName ='" + s2 + "'");
            if (rs.next()) {
                out.println("<center>");
                out.println("<table cellspacing='30'>");

                out.println("<tr>");
                out.println("<tr><td>partyID<input type = 'text' value = " + rs.getString(1) + " name='u'/><td></tr>");
                out.println("<tr><td>firstName<input type = 'text' value = " + rs.getString(2) + " name='u1'/><td></tr>");
                out.println("<tr><td>lastName<input type = 'text' value = " + rs.getString(3) + " name='u2'/><td></tr>");
                out.println("<tr><td>address<input type = 'text' value = " + rs.getString(4) + " name='u3'/><td></tr>");
                out.println("<tr><td>city<input type = 'text' value = " + rs.getString(5) + " name='u4'/><td></tr>");
                out.println("<tr><td>zip<input type = 'text' value = " + rs.getString(6) + " name='u5'/><td></tr>");
                out.println("<tr><td>state<input type = 'text' value = " + rs.getString(7) + " name='u6'/><td></tr>");
                out.println("<tr><td>country<input type = 'text' value = " + rs.getString(8) + " name='u7'/><td></tr>");
                out.println("<tr><td>phone<input type = 'text' value = " + rs.getString(9) + " name='u8'/><td></tr>");
                out.println("<tr><td>userLoginID<input type = 'text' value = " + rs.getString(10) + " name='un'/><td></tr>");
                out.println("<tr><td>password<input type = 'text' value = " + rs.getString(11) + " name='up'/><td></tr>");
                
//	 out.println("<tr><form action='update'><th colspan='2'><input type='submit' class='B' value='update'></th></tr></form>");
            }
            RequestDispatcher rd = Request.getRequestDispatcher("");
            rd.include(Request, Response);
            con.close();

        } catch (Exception e1) {
            out.println(e1);
        }
        out.println("</table>");
        out.println("</center>");
        out.println("</body>");
        out.println("</html>");
        out.close();

    }
}
