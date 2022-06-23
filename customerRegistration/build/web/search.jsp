<%@ page import= "java.sql.*" %>
<%@  include file = "menu1.jsp" %>

<% String s1 = request.getParameter("u");
   String s2 = request.getParameter("u1");
   String s3 = request.getParameter("u8");
    out.println("<html>");
    out.println("<body>");
    out.println("<head><link rel='stylesheet' href = 'aaa.css'/></head><body>");
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String db_ur1 = "jdbc:mysql://localhost:3306/sqlassignment?useSSL=false";
        String db_uname = "root";
        String db_upass = "Root";
        Connection con = DriverManager.getConnection(db_ur1, db_uname, db_upass);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(
                "select * from party1 where partyId ='" + s1 + "' and fName ='" + s2 + "'");
        if (rs.next()) {
%>
      <table>
        <thead>
          <tr>
              <th><b>party Id</th>
              <th><b>First Name</th>
               <th><b>Address</th>
              <th><b>Address</th>
              <th><b>City</th>
              <th><b>Zip</th>
              <th><b>State</th>
              <th><b>Country</th>
              <th><b>Phone</th>
              <th><b>Action </th>
          </tr>
          </thead>
<%
        out.println("<tbody><tr>");
          out.println("<td> " + rs.getString(1) + " </td>");
          out.println("<td> " + rs.getString(2) + " </td>");
          out.println("<td> " + rs.getString(3) + " </td>");
          out.println("<td> " + rs.getString(4) + " </td>");
          out.println("<td> " + rs.getString(5) + " </td>");
          out.println("<td> " + rs.getString(6) + " </td>");
          out.println("<td> " + rs.getString(7) + " </td>");
          out.println("<td> " + rs.getString(8) + " </td>");          
          out.println("<td> " + rs.getString(9) + " </td>");
%>
            <td> <a href='update?partyId=" +  rs.getString(1)  + "'>Update</a>
                 &nbsp;<a href='menu.jsp?fName=" +  rs.getString(2)+ "'>Delete</a> </td>
 <%  }
else {
     out.print("<center style= margin-top:20px><h5 style= text-color:DodgerBlue;>invalid user name and password</h5></center>");
//            RequestDispatcher dis = request.getRequestDispatcher("menu1.jsp");
//            dis.include(request, response);
}
        con.close();
    } catch (Exception e1) {
        out.println(e1);
    }
    out.println("</tr></tbody></table>");
    out.println("</body>");
    out.println("</html>");

%>



