package com.java.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by User on 29.02.2016.
 */
public class StudentsAddition extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/jsp/studentAdd.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstname = req.getParameter("firstname");
        String lastname = req.getParameter("lastname");
        String age = req.getParameter("age");

        Student student = new Student();
        student.setFirstname(firstname);
        student.setLastname(lastname);
        student.setAge(new Integer(age));

        req.setAttribute("student", student);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/jsp/studentInfo.jsp");
        requestDispatcher.forward(req, resp);
    }
}
