<%@ page import= "java.sql.*" %>
<%@include file="menu1.jsp" %> 		

<%    out.println("<html>");
    out.println("<body>");
    out.println("<link rel='stylesheet' href = 'aaa.css'/>");
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

out.println("<td>"  + "<a href='update?partyId= " +  rs.getString(1)  + "'> Update </a>" );
out.println( "&nbsp;<a href='menu.jsp?fName= " +  rs.getString(2)  + "'> Delete </a>" + "</td>");
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
%>

<!--             <td> <button onclick="window.location.href='delete1';">Delete</button> 
             <button onclick="window.location.href='update.html';">Update</button> </td>-->