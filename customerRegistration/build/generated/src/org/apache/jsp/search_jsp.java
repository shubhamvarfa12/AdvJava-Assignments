package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class search_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                    <li ><a href=\"login1.html\">Home</a></li>\n");
      out.write("                    <li class=\"active\"><a href=\"Registration1.html\">Logout</a></li>            \n");
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
      out.write("                                    <input id=\"first_name\" type=\"text\" class=\"validate\" name=\"u1\" required>\n");
      out.write("                                    <label for=\"first_name\">First Name</label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"input-field col s6\">\n");
      out.write("                                    <input id=\"last_name\" type=\"text\" class=\"validate\" name=\"u2\">\n");
      out.write("                                    <label for=\"last_name\">Last Name</label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"input-field col s6\">\n");
      out.write("                                    <input id=\"mobile\" type=\"text\" class=\"validate\" name=\"u8\" data-length=\"10\">\n");
      out.write("                                    <label for=\"Mobile\">Mobile</label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                                 <div class=\"col m6 l6 offset-l4\">\n");
      out.write("                            <button class=\"btn waves-effect waves-light\" type=\"submit\" name=\"action\" \n");
      out.write("                                    onclick=\"M.toast({html: 'your form has been submitted'})\" >Submit\n");
      out.write("                            </button>\n");
      out.write("                                 </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
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
                response.sendRedirect("login.html");
            }
        
      out.write("\n");
      out.write("   </body>\n");
      out.write("</html>");
      out.write('\n');
      out.write('\n');
 String s1 = request.getParameter("u1");
   String s2 = request.getParameter("u2");
   String s3 = request.getParameter("u8");
    out.println("<html>");
    out.println("<body>");

//    out.println("<head><link rel='stylesheet' href = 'abc.css'/></head><body>"
//            + "<center><form action='search.jsp'><table cellpadding ='10px'  cellspacing='20' ><tr><td>Enter last Name"
//            + " <input type='text' placeholder='enter first name' name='u1'></td></tr><tr><td>Enter last name<input type='text' placeholder='enter last name' name='u1'></td></tr><tr><th colspan='2'>"
//            + "<input type='submit' class='B' value='search'></th></tr></div></table></form></center>");
//    out.println("</table>");
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String db_ur1 = "jdbc:mysql://localhost:3306/sqlassignment?useSSL=false";
        String db_uname = "root";
        String db_upass = "Root";
        Connection con = DriverManager.getConnection(db_ur1, db_uname, db_upass);
        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery(
                "select * from party1 where fName ='" + s1 + "' and IName ='" + s2 + "'");
        if (rs.next()) {

      out.write("\n");
      out.write("      <table>\n");
      out.write("        <thead>\n");
      out.write("          <tr>\n");
      out.write("              <th>party Id</th>\n");
      out.write("              <th>First Name</th>\n");
      out.write("               <th>Address</th>\n");
      out.write("              <th>Address</th>\n");
      out.write("              <th>City</th>\n");
      out.write("              <th>Zip</th>\n");
      out.write("              <th>State</th>\n");
      out.write("              <th>Country</th>\n");
      out.write("              <th>Phone</th>\n");
      out.write("              <th>Action</th>\n");
      out.write("          </tr>\n");
      out.write("          </thead>\n");

        out.println("<tbody><tr>");
          out.println("<td><input type = 'text' value = " + rs.getString(1) + " name='u'></td>");
          out.println("<td><input type = 'text' value = " + rs.getString(2) + " name='u1'></td>");
          out.println("<td><input type = 'text' value = " + rs.getString(3) + " name='u2'></td>");
          out.println("<td><input type = 'text' value = " + rs.getString(3) + " name='u3'></td>");
          out.println("<td><input type = 'text' value = " + rs.getString(4) + " name='u4'></td>");
           out.println("<td><input type = 'text' value = " + rs.getString(5) + " name='u5'></td>");
           out.println("<td><input type = 'text' value = " + rs.getString(6) + " name='u6'></td>");
           out.println("<td><input type = 'text' value = " + rs.getString(7) + " name='u7'></td>");
           out.println("<td><input type = 'text' value = " + rs.getString(8) + " name='u8'></td>");
           out.println("</tr></tbody></table>");

      out.write("\n");
      out.write("<!--//\t out.println(\"<tr><form action='update'><th colspan='2'><input type='submit' class='B' value='update'></th></tr></form>\");-->\n");
      out.write(" ");
       } 
        con.close();
//        response.sendRedirect("search.jsp");
    } catch (Exception e1) {
        out.println(e1);
    }
//    out.println("</center>");
//    out.println("</div>");
    out.println("</body>");
    out.println("</html>");


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
