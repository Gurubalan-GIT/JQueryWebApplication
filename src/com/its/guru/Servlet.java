package com.its.guru;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String email= req.getParameter("email");
        String password=req.getParameter("pwd");
        DAO dao=new DAO();
        try {
            dao.addUser(email, password);
            HttpSession session=req.getSession();
            session.setAttribute("email",email);
            res.sendRedirect("success.jsp");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
