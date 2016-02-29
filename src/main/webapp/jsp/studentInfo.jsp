<%@ page import="com.java.servlets.Student" %>
<html>
    <body>
        <%
            String st = "something";
            Student student = (Student) request.getAttribute("student");
        %>

        <%= student.getFirstname() %>
    </body>
</html>