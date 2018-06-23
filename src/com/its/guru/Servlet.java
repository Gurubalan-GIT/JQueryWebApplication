package com.its.guru;

import net.sf.json.JSONObject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String fn=req.getParameter("fn");
        //From Json-lib-2.4
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("FN",fn);
        res.setContentType("application/json");
        PrintWriter out=res.getWriter();
        out.print(jsonObject);
    }
}
