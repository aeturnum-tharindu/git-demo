package com.company.gitdemo.dto;

import org.springframework.stereotype.Component;

@Component
public class User {

    private User() {
        System.out.println("Private Constructor !");
    }

    public void m() {
        System.out.println("Method Called !");
    }
}
