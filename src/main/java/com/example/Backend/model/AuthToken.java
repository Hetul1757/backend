package com.example.Backend.model;

public class AuthToken {

    private String token;
    private Long id;
    public AuthToken(){

    }

    public AuthToken(String token,long id){
        this.token = token;
        this.id=id;
        
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
