package com.yuanma.shoppingmallapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@SpringBootApplication
public class ShoppingMallApiApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingMallApiApplication.class, args);
    }

    //将jar文件下的对应静态资源文件路径对应到磁盘的路径(根据个人的情况修改"file:static/"的static的值)
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.
                addResourceHandler("/static/**").
                addResourceLocations("classpath:/static/", "file:/");
    }
}
