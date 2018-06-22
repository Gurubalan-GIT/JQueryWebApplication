package com.its.guru;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String fn = req.getParameter("fn");
        String ln = req.getParameter("ln");
        String un = req.getParameter("un");
        String pass = req.getParameter("pass");
        String address = req.getParameter("address");
        String gender = req.getParameter("gender");
        PrintWriter out = res.getWriter();
        try {
            DAO dao=new DAO();
            dao.addUser(fn,ln,un,pass,address,gender);
            out.print("<html><body><h1>Success!</h1></body></html>  ");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
