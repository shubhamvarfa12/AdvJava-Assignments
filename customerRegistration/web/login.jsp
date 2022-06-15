<%@ page import= "java.sql.*" %>

<%
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
%>