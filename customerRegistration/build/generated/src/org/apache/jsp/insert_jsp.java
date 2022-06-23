package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class insert_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link rel=\"stylesheet\" href = \"abc.css\"/>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link rel=\"stylesheet\" href = \"abc.css\"/>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<center>\n");
      out.write("    <div id=\"mymenu\">\n");
      out.write("<ul>\n");
      out.write("<li><a href = \"menu1.jsp\">Home</li></a>\n");
      out.write("<li><a href = \"insert.jsp\">Insert</li></a>\n");
      out.write("<li><a href = \"search.jsp\">Search</li></a>\n");
      out.write("<li><a href = \"showAll.jsp\">ShowAll</li></a>\n");
      out.write("<li><a href = \"delete.jsp\">Delete</li></a>\n");
      out.write("<li><a href = \"update1.jsp\">Update1</li></a>\n");
      out.write("<li><a href = \"login.html\">Logout</li></a>\n");
      out.write("<li><a href = \"about.html\">About</li></a>\n");
      out.write("</ul>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("    ");

//        String s =(String)session.getAttribute("uname");; 
//  if(s!=null) 
         
//         Cookie c1 = null;
           Cookie c[] = request.getCookies(); 
           if(c!=null)
           {   
//		 for (int i = 0; i < c.length; i++) {
//                c1 = c[i];
////               out.print("Name : " + c1.getName() + ",  ");
//               out.print("Value:= " + c1.getValue()+" <br/>");
//                 }
                    
		out.println("welcome "+ c[1].getValue());
                }
                else
                {
                    response.sendRedirect("login.html");
                }

      out.write("\n");
      out.write("</center>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("\n");
      out.write("<div id = \"pg1\" cellpadding=\"100px\">\n");
      out.write("<center>\n");
      out.write("<p>INSERT PAGE</p>\n");
      out.write("</center>\n");
      out.write("</div>\n");
      out.write("<center>\n");
      out.write("\n");
      out.write("<form action=\"search.jsp\">\n");
      out.write("<table cellpading=\"50px\" cellspacing=\"15\">\n");
      out.write("<tr>\n");
      out.write("<td> RollNo</td>\n");
      out.write("<td> <input type=\"text\" placeholder=\"Rollno\" name=\"u1\"></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td> Enter User Name</td>\n");
      out.write("<td> <input type=\"text\" placeholder=\"Username\" name=\"u2\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td> Contact Name</td>\n");
      out.write("<td> <input type=\"text\" placeholder=\"physics\" name=\"u3\"></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td> chemistry</td>\n");
      out.write("<td> <input type=\"text\" placeholder=\"Chemisty\" name=\"u4\"></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td> Maths</td>\n");
      out.write("<td> <input type=\"text\" placeholder=\"maths\" name=\"u5\"></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<th colspan=\"2\"><input type=\"submit\" class=\"B\" value=\"insert\" ></th>\n");
      out.write("</tr>\n");
      out.write("</table>\t\n");
      out.write("</form>\n");
      out.write("</center>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>");
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
