package by.katenromanenko.web;

import jakarta.servlet.*;
import java.io.IOException;

public class HelloFilter implements Filter {
    @Override public void init(FilterConfig filterConfig) {  }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        System.out.println("Привет сервлет");
        chain.doFilter(request, response);
    }

    @Override public void destroy() {  }
}