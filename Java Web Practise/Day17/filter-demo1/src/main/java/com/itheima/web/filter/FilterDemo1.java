package com.itheima.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/*")
public class FilterDemo1 implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        //1. 放行前，對request數據進行處理
        System.out.println("1. FilterDemo...");

        //放行
        filterChain.doFilter(servletRequest, servletResponse);

        //1. 放行後，對response數據進行處理
        System.out.println("5. FilterDemo...");


    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }
}
