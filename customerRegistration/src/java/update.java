import java.io.*;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/update")
public class update extends HttpServlet {

    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    int row;

    public void doGet(HttpServletRequest req, HttpServletResponse rsp)
            throws IOException, ServletException {
        rsp.setContentType("text/html");
        PrintWriter out = rsp.getWriter();
        String s1 = req.getParameter("u");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost/sqlassignment", "root", "Root");
            pst = con.prepareStatement("select * from party where partyId = ?");
            pst.setString(1, s1);
            rs = pst.executeQuery();
            while (rs.next()) {
                out.print("<form action= 'update' method='POST'>");
                out.print(
                        "<table><tr> <td> First Name </td><td> <input type='text' name='u1' value= '" + rs.getString(
                                2) + "' </td>");
                out.print(
                        "</tr><tr><td> Last Name </td><td> <input type='text' name='u2' value='" + rs.getString(
                                3) + "' </td>");
                out.print(
                        "</tr><tr><td> Address </td><td> <input type='text' name='u3' value='" + rs.getString(
                                4) + "' </td></tr><tr>");
                out.print(
                        " <td> City </td><td> <input type='text' name='u4' value='" + rs.getString(
                                5) + "' </td></tr><tr>");
                out.print(
                        "<td> Zip </td><td> <input type='text' name='u5' value= '" + rs.getString(
                                6) + "' </td></tr><tr><th colspan='2'>");
                out.print(
                        " <input type='submit' class='B' name='b2' value='Update'></th></tr> </table> </form>");
            }
        } catch (Exception e) {
            out.println("<font color='red'>  Record Failed   </font>");
        }
    }

}
