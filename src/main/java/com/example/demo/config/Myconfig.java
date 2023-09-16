package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class Myconfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginIntercepter())
                .addPathPatterns("/**")//拦截所有请求
                .excludePathPatterns("/user/login")
                .excludePathPatterns("/*.ico")
                .excludePathPatterns("/user/reg");//排除不需要拦截的请求
    }
}
