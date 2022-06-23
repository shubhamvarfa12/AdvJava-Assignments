package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class showAll_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("        <link href=\"https://fonts.googleapis.com/\n");
      out.write("              css?family=Josefin+Sans&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Compiled and minified CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css\">\n");
      out.write("\n");
      out.write("        <!-- Compiled and minified JavaScript -->\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js\"></script>\n");
      out.write("        <!--<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>-->   \n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            *{font-fmaily: 'Josefin Sans',sans-serif;}\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body> \n");
      out.write("        <nav class = \"blue lighten-1\">\n");
      out.write("            <div class=\"nav-wrapper  container \">\n");
      out.write("                <a href=\"#!\" class=\"brand-logo\">Customer DashBoard</a>\n");
      out.write("                <ul class=\"right hide-on-med-and-down\">\n");
      out.write("                    <li ><a href=\"menu1.jsp\">Home</a></li>\n");
      out.write("                    <li ><a href=\"showAll.jsp\">Show-All</a></li>\n");
      out.write("                    <li ><a href=\"login1.html\">Logout</a></li>            \n");
      out.write("                </ul>   \n");
      out.write("            </div>  \n");
      out.write("        </nav>  \n");
      out.write("\n");
      out.write("        <!--contect form--> \n");
      out.write("        <section>\n");
      out.write("            <h3 class=\"center-align blue-text\">Search Customers Details</h3>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col m6 l6 offset-l3\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <form action=\"search.jsp\" class=\"col s12\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"input-field col s6\">\n");
      out.write("                                    <input id=\"Party_Id\" type=\"text\" class=\"validate\" name=\"u\" required>\n");
      out.write("                                    <label for=\"Party_Id\">Party Id</label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"input-field col s6\">\n");
      out.write("                                    <input id=\"First_name\" type=\"text\" class=\"validate\" name=\"u1\">\n");
      out.write("                                    <label for=\"First_name\">First Name</label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("<!--                            <div class=\"row\">\n");
      out.write("                                <div class=\"input-field col s6\">\n");
      out.write("                                    <input id=\"mobile\" type=\"text\" class=\"validate\" name=\"u8\" data-length=\"10\">\n");
      out.write("                                    <label for=\"Mobile\">Mobile</label>\n");
      out.write("                                </div>-->\n");
      out.write("                            </div>\n");
      out.write("                                 <div class=\"col m6 l6 offset-l4\">\n");
      out.write("                            <button class=\"btn waves-effect waves-light\" type=\"submit\" name=\"action\" \n");
      out.write("                                    onclick=\"M.toast({html: 'your form has been submitted'})\" >Submit\n");
      out.write("                            </button>\n");
      out.write("                          </div>      \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $('.modal').modal();\n");
      out.write("                $('input#mobile').characterCounter();\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        ");

            String s = (String) session.getAttribute("fname");
//              if(s!=null) 
//              {
            //         Cookie c1 = null;
            Cookie c[] = request.getCookies();
            if (c != null) {
                //		 for (int i = 0; i < c.length; i++) {
                //                c1 = c[i];
//                               out.print("Name : " + c[0].getName());
//                               out.print("Value:= " + c[0].getValue()+" <br/>");
                //                 }
//                out.println("welcome " + c[0].getName());
            } else {
                response.sendRedirect("login1.html");
            }
        
      out.write("\n");
      out.write("   </body>\n");
      out.write("</html>");
      out.write(" \t\t\n");
      out.write("\n");
    out.println("<html>");
    out.println("<body>");
    out.println("<link rel='stylesheet' href = 'aaa.css'/>");
//out.println("</head><body><div id='mymenu'><ul><li><a href ='mymenu.html'>Home</li></a><li><a href = 'insert.html'>Insert</li></a><li><a href = 'searchD'>Search</li></a><li><a href = 'delete.html'>Delete</li></a><li><a href = 'update.html'>Update</li></a><li><a href = 'login.html'>Logout</li></a><li><a href = 'about.html'>About</li></a></ul></div><center>");
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String db_ur1 = "jdbc:mysql://localhost:3306/sqlassignment?useSSL=false";
        String db_uname = "root";
        String db_upass = "Root";
        Connection con = DriverManager.getConnection(db_ur1, db_uname, db_upass);
        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery("select * from party1");
        out.println("<center><table cellspacing='30'>");

        out.println("<tr>");
        out.println("<td><b> partyId</td>");
        out.println("<td> <b>FirstName</td>");
        out.println("<td> <b>LastName</td>");
        out.println("<td> <b>Address</td>");
        out.println("<td> <b>City</td>");
        out.println("<td> <b>Zip</td>");
        out.println("<td> <b>State</td>");
        out.println("<td> <b>Country</td>");
        out.println("<td> <b>Phone</td>");
        out.println("<td> <b>Action</td>");
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

out.println("<td>"  + "<a href='update?partyId= " +  rs.getString(1)  + "'> Update </a>" + "</td>");
out.println("<td>"  + "<a href='delete.jsp?fName= " +  rs.getString(2)  + "'> Delete </a>" + "</td>");

      out.write("\n");
      out.write("<!--             <td> <button onclick=\"window.location.href='delete1';\">Delete</button> \n");
      out.write("             <button onclick=\"window.location.href='update.html';\">Update</button> </td>-->\n");
      out.write("\n");
        }
        out.println("</tr></table></center>");
        con.close();

    } catch (Exception e1) {
        out.println(e1);
    }

    out.println("</center>");
    out.println("</body>");
    out.println("</html>");
    out.close();

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
