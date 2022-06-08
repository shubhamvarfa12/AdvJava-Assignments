import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

  public class helloWordFromServlet extends HttpServlet
  {
     public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException,ServletException
       {
            PrintWriter out = response.getWriter();
            out.println("<html> <body>");
            out.println("Hello Word from Servlet");
            out.println("</body>");
            out.println("</html>");
            out.close();
       }
}