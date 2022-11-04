package com.example.experimentchapter45.Interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class Config implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry)
    {
        HandlerInterceptor interceptor=new LoginInterceptor();
        registry.addInterceptor(interceptor).addPathPatterns("/c/booklist");
    }
}
