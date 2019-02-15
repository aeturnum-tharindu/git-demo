package com.company.gitdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.company.gitdemo.dto.User;

@SpringBootApplication
public class GitDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(GitDemoApplication.class, args);
        User user = context.getBean(User.class);
        user.m();
    }

}
