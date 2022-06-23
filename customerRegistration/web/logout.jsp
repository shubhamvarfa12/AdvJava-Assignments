<%
//      HttpSession session=Request.getSession(true);
//                  session.invalidate();     

    Cookie ck = new Cookie("Shubham_varfa", "");
    ck.setMaxAge(0);
    response.addCookie(ck);
    response.sendRedirect("login1.html");

%>