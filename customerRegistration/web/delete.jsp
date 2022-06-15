<%@ page import= "java.sql.*" %>
<%@include file="menu.jsp" %> 
<html>
    <head>
        <link rel="stylesheet" href="aaa.css" />
    </head>
    <body>          
        <%   String Q = request.getParameter("b1");
//                    if (s != null) {
            String s1 = request.getParameter("up");
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/sqlassignment?useSSL=false",
                        "root", "Root");
                Statement st = con.createStatement();
                st.executeUpdate(
                        "delete from party1 where password='" + s1 + "'");
                response.sendRedirect("showAll.jsp");
                con.close();
                //        response.sendRedirect("search.jsp");
            } catch (Exception e1) {
                out.println(e1);
            }
//                    }
%>
    </body>        
</html>                                



