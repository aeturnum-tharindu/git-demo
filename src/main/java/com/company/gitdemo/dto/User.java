package com.company.gitdemo.dto;

import org.springframework.stereotype.Component;

@Component
public class User {

	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String uid;
	
    private User() {
        System.out.println("Private Constructor !");
    }

    public void m() {
        System.out.println("Method Called !");
    }
}
