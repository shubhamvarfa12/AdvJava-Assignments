package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class delete_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("        ");
      out.write(" \n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"aaa.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"data\">\n");
      out.write("            <center>\n");
      out.write("\n");
      out.write("                <form action=\"delete.jsp\">\n");
      out.write("                    <table cellpadding=\"15px\">\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Enter party ID </td>\n");
      out.write("                            <td> <input type=\"text\" placeholder=\"Enter partyID\" name = \"u\" ></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <th colspan=\"2\">\n");
      out.write("                                <input type=\"submit\" class=\"B\" name=\"b1\" value = \"delete\" ></th>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("                ");
     
                    String Q = request.getParameter("b1");
//                    if (s != null) {
                        String s1 = request.getParameter("u");
                        try {
                            Class.forName("com.mysql.cj.jdbc.Driver");
                            Connection con = DriverManager.getConnection(
                                    "jdbc:mysql://localhost:3306/sqlassignment?useSSL=false",
                                    "root", "Root");
                            Statement st = con.createStatement();
                            st.executeUpdate("delete from party1 where partyid='" + s1 + "'");
                            response.sendRedirect("showAll.jsp");

                            con.close();
               //        response.sendRedirect("search.jsp");
                        } catch (Exception e1) {
                            out.println(e1);
                        }
//                    }
                
      out.write("\n");
      out.write("\n");
      out.write("                <!--                </table>;    \n");
      out.write("                                </center>;\n");
      out.write("                                </body>;\n");
      out.write("                                </html>;-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
