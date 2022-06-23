package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class update1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/menu1.jsp");
  }

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"abc.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href = \"abc.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <div id=\"mymenu\">\n");
      out.write("            <ul>\n");
      out.write("                <li><a href ='menu1.jsp'>HOME</a></li>\n");
      out.write("                <li> <a href = 'search.jsp'>SEARCH</a></li>\n");
      out.write("                <li><a href = 'showAll.jsp'>DisplayAll</a></li>\n");
      out.write("                <li><a href = 'update1.jsp'>UPDATE</a></li>\n");
      out.write("                <li><a href = 'delete.jsp'>DELETE</a></li>\n");
      out.write("                <li><a href = 'logout.jsp'>LOGOUT</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        ");

            String s = (String) session.getAttribute("userLoginId");;
//              if(s!=null) 
//              {
            //         Cookie c1 = null;
            Cookie c[] = request.getCookies();
            if (c != null) {
                //		 for (int i = 0; i < c.length; i++) {
                //                c1 = c[i];
                ////               out.print("Name : " + c1.getName() + ",  ");
                //               out.print("Value:= " + c1.getValue()+" <br/>");
                //                 }

                out.println("welcome " + c[1].getName());
            } else {
                response.sendRedirect("login.html");
            }
        
      out.write("\n");
      out.write("    </center>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write(" \n");
      out.write("\n");
      out.write("        <div id=\"data\">\n");
      out.write("            <center>\n");
      out.write("\n");
      out.write("                <form action=\"update1.jsp\">\n");
      out.write("                    <table cellpadding=\"15px\">\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Enter User Name </td>\n");
      out.write("                            <td> <input type=\"text\" placeholder=\"Enter User Name\" name = \"u1\" ></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <th colspan=\"2\">\n");
      out.write("                                <input type=\"submit\" class=\"B\" name=\"b1\" value = \"Search\" ></th>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("                ");
        String Q = request.getParameter("b1");
                    if (s != null) {
                        String s1 = request.getParameter("u1");
                        try {
                            Class.forName("com.mysql.cj.jdbc.Driver");
                            Connection con = DriverManager.getConnection(
                                    "jdbc:mysql://localhost:3306/sqlassignment?useSSL=false",
                                    "root", "Root");
                            Statement st = con.createStatement();
                            ResultSet rs = st.executeQuery(
                                    "select * from party where firstName='" + s1 + "'");
                            if (rs.next()) {
                
      out.write("\n");
      out.write("\n");
      out.write("                <form action=\"update1.jsp\">\n");
      out.write("                    <table>  \n");
      out.write("                        <tr>\n");
      out.write("                            <td> First Name </td>\n");
      out.write("                            <td> <input type=\"text\" name=\"u1\" value=");
      out.print( rs.getString(2));
      out.write(" </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td> Last Name </td>\n");
      out.write("                            <td> <input type=\"text\" name=\"u2\" value=");
      out.print( rs.getString(3));
      out.write(" </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td> Address </td>\n");
      out.write("                            <td> <input type=\"text\" name=\"u3\" value=");
      out.print( rs.getString(4));
      out.write(" </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td> City </td>\n");
      out.write("                            <td> <input type=\"text\" name=\"u4\" value=");
      out.print( rs.getString(5));
      out.write(" </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td> Zip </td>\n");
      out.write("                            <td> <input type=\"text\" name=\"u5\" value=");
      out.print( rs.getString(6));
      out.write(" </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <th colspan=\"2\">\n");
      out.write("                                <input type=\"submit\" class=\"B\" name=\"b2\" value=\"Update\"></th>\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("                ");


                            }
                            con.close();
                        } catch (Exception e1) {
                            out.println(e1);
                        }
                    }
                
      out.write("\n");
      out.write("            </center>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");

    String s11 = request.getParameter("b2");
    if (s11 != null) {
        String s12 = request.getParameter("u1");
        String s13 = request.getParameter("u2");
        String s14 = request.getParameter("u3");
        String s15 = request.getParameter("u4");
        String s16 = request.getParameter("u5");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/sqlassignment?useSSL=false",
                    "root", "Root");
            Statement st = con.createStatement();
            st.executeUpdate(
                    "update party set firstName='" + s12 + "',lastName='" + s13 + "',address='" + s14 + "',city='" + s15 + "',state='" + s16 + "' where firstName='" + s12 + "'");

            response.sendRedirect("showAll.jsp");
            con.close();
        } catch (Exception e1) {
            out.println(e1);
        }
    }


      out.write('\n');
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
