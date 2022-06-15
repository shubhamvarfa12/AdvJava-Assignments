package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');

    String s1 = request.getParameter("u");
    String s = request.getParameter("u1");
    String s2 = request.getParameter("up");
    try {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/sqlassignment?useSSL=false", "root",
                "Root");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(
                "select * from party1 where partyId='" + s1 + "' AND fname='" + s + "' AND password='" + s2 + "'");
        if (rs.next()) {
            Cookie ck = new Cookie("Shubham_Varfa", s);
            ck.setMaxAge(60 * 60);
            response.addCookie(ck);
//                    session.invalidate();
// HttpSession session1= request.getSession();          
// session1.setAttribute("Shubham_varfa",s1);
            response.sendRedirect("menu1.jsp");
        } else {
            out.println(
                    "<script type=\"text/javascript\">");
            out.println("alert('User or password incorrect');");
            out.println("location='login1.html';");
            out.println("</script>");
//                    "<center style= margin-top:20px><h1>ERROR 404</h1>invalid user name and password</center>");
//            RequestDispatcher dis = request.getRequestDispatcher("login.jsp");
//            dis.include(request, response);
//                 response.sendRedirect("login1.html");
        }
        con.close();
    } catch (Exception e1) {
        out.println(e1);
    }

    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
