package com.company.gitdemo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserCotroller {

    @PostMapping("/user/getUser")
    public void getUser() {

    }

}
