package com.example.experimentchapter45.Interceptor;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class LoginInterceptor implements HandlerInterceptor
{
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("拦截器生效");
        if(request.getParameter("username") != null && request.getParameter("password") != null && !request.getParameter("password").equals("") && !request.getParameter("username").equals(""))
        {
            return true;
        }
        else
        {
            response.sendRedirect("http://localhost:8080/c/register");
        }
        return true;
    }
}
