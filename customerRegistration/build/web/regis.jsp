<%@ page import= "java.sql.*" %>
<%  String s = request.getParameter("u");
    String s1 = request.getParameter("u1");
    String s2 = request.getParameter("u2");
    String s3 = request.getParameter("u3");
    String s4 = request.getParameter("u4");
    String s5 = request.getParameter("u5");
    String s6 = request.getParameter("u6");
    String s7 = request.getParameter("u7");
    String s8 = request.getParameter("u8");
    String s9 = request.getParameter("up");
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/sqlassignment?useSSL=false", "root",
                "Root");
        Statement st = con.createStatement();
        st.executeUpdate(
                "insert into party1 values('" + s + "','" + s1 + "','" + s2 + "','" + s3 + "','" + s4 + "','" + s5 + "','" + s6 + "','" + s7 + "','" + s8 + "','" + s9 + "')");
        con.close();
        response.sendRedirect("login1.html");
        out.println("data insert");
    } catch (Exception e1) {
        out.println(e1);
    }

%>