package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ordinaryuser {
    @Id
    @GeneratedValue
    private String ord_usr_id;

    private String pwd;

    private String telephone;

    private String name;

    public ordinaryuser() {
    }

    public String getOrd_usr_id() {
        return ord_usr_id;
    }

    public void setOrd_usr_id(String ord_usr_id) {
        this.ord_usr_id = ord_usr_id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
