package com.philip.web.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/bservlet")
public class BServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 獲取Cookie

        // 獲取Cookie數組
        Cookie[] cookies = req.getCookies();

        // 遍歷數組
        for (Cookie cookie : cookies) {
            // 獲取數據
            String name = cookie.getName();
            if ("username".equals(name)){
                String value = cookie.getValue();
                System.out.println(name + ":" + value);
                break;
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
