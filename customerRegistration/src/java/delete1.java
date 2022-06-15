import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/delete1")
public class delete1 extends HttpServlet {
    Connection con;
    ResultSet rs;
    int row;
    public void doGet(HttpServletRequest req,HttpServletResponse rsp ) throws IOException,ServletException
    {
        rsp.setContentType("text/html");
        PrintWriter out = rsp.getWriter();
        
        String s1 = req.getParameter("u1");
        try {
             Class.forName("com.mysql.jdbc.Driver");
            String db_ur1 = "jdbc:mysql://localhost:3306/sqlassignment?useSSL=false";
            String db_uname = "root";
            String db_upass = "Root";
            con = DriverManager.getConnection(db_ur1, db_uname, db_upass);
            Statement st = con.createStatement();
            st.executeUpdate("delete from party1 where fName='" + s1 + "'");
            
            out.println("<font color='green'>  Record Deletedddddd   </font>");
            rsp.sendRedirect("showAll.jsp");
            }  
            catch (Exception e) {
            out.println(e +"<font color='red'>  Record Failed   </font>");

        }
    
    
    }
    
}