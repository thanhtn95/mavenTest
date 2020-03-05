package com.example.demomaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.swing.text.html.HTML;

@SpringBootApplication
@EnableSpringDataWebSupport
@EnableWebMvc
@EnableTransactionManagement
public class DemomavenApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemomavenApplication.class, args);
    }
}
