package com.example.demo;

public abstract class User {
    protected String telephone;
    protected String passwd;
    protected String name;
    protected String idcard;

    public abstract String login();

    public void resetpasswd() {
        System.out.println("resetpassword");
    }


}
