package com.atzyy.shop.config;

import com.atzyy.shop.filters.MyFilter;
import com.atzyy.shop.servlets.MyServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyServerConfig {

    @Bean
    public ServletRegistrationBean reigstServlet(){
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean();
        servletRegistrationBean.setServlet(new MyServlet());
        servletRegistrationBean.addUrlMappings("/servlet");
        return servletRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new MyFilter());
        filterRegistrationBean.addUrlPatterns("/servlet");
        return filterRegistrationBean;
    }

}
