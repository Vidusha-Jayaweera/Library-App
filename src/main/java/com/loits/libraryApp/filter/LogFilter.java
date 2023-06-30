package com.loits.libraryApp.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LogFilter implements Filter {

    private static final Logger log = LoggerFactory.getLogger(LogFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

        log.info("----------- Filter init -----------");

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        log.info("-----Request received for path : {} method : {}", request.getRequestURL().toString(), request.getMethod());
        filterChain.doFilter(servletRequest, servletResponse);
        log.info("-----Response sent with status : {}", response.getStatus());

    }

    @Override
    public void destroy() {

        log.info("----------- Filter destroy -----------");

    }
}
