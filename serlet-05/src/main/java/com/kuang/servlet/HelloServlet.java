package com.kuang.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author wbw
 * @date 2021/8/7 14:52
 */
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //this.getInitParameter(); //初始化参数
//        this.getServletConfig(); //Servlet配置
//        this.getServletContext(); //上下文
        ServletContext context = this.getServletContext();
        String username = "wbw";//数据
        context.setAttribute("username", username); //将一个数据保存在ServletContext中，名字为username,值username

        System.out.println("Hello World!!!");
    }
}
