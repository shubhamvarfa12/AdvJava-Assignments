
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class displayAll extends HttpServlet {

    public void doGet(HttpServletRequest Request, HttpServletResponse Response) throws IOException, ServletException {
        PrintWriter out = Response.getWriter();

        out.println("<html>");
        out.println("<body>");
        out.println("<link rel='stylesheet' href = 'style.css'/>");
        out.println("</head><body><div id='mymenu'><ul><li><a href ='MenuDemo'>Home</li></a>"
                + "<li><a href = 'SearchDemo'>Search</li></a><li>"
                + "<a href = 'DeleteDemo'>Delete</li></a><li>"
                + "<a href = 'updateDemo'>Update</li></a><li>"
                + "<a href = 'LogoutDemo'>Logout</li></a><li>"
                + "</ul></div><center>");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String db_ur1 = "jdbc:mysql://localhost:3306/Sqlassignment?useSSL=false";
            String db_uname = "root";
            String db_upass = "Root";
            Connection con = DriverManager.getConnection(db_ur1, db_uname, db_upass);
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("select * from party");
            out.println("<table cellspacing='30'>");

            out.println("<tr>");
            out.println("<td> partyId</td>");
            out.println("<td> FirstName</td>");
            out.println("<td> LastName</td>");
            out.println("<td> Address</td>");
            out.println("<td> City</td>");
            out.println("<td> Zip</td>");
            out.println("<td> State</td>");
            out.println("<td> Country</td>");
            out.println("<td> Phone</td>");
            out.println("<td> UserLoginD</td>");
            out.println("</tr>");

            while (rs.next()) {
                out.println("<tr>");
                out.println("<td>" + rs.getString(1) + "</td>");
                out.println("<td>" + rs.getString(2) + "</td>");
                out.println("<td>" + rs.getString(3) + "</td>");
                out.println("<td>" + rs.getString(4) + "</td>");
                out.println("<td>" + rs.getString(5) + "</td>");
                out.println("<td>" + rs.getString(6) + "</td>");
                out.println("<td>" + rs.getString(7) + "</td>");
                out.println("<td>" + rs.getString(8) + "</td>");
                out.println("<td>" + rs.getString(9) + "</td>");
                out.println("<td>" + rs.getString(10) + "</td>");

                out.println("</tr>");
            }
            out.println("</table>");
            con.close();

        } catch (Exception e1) {
            out.println(e1);
        }

        out.println("</center>");
        out.println("</body>");
        out.println("</html>");
        out.close();

    }
}
