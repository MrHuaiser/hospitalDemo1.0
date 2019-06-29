package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class department {
    @Id
    @GeneratedValue
    private Integer dept_id;

    private Integer dept_cat_id;

    private String name;

    private String desc;

    public department() {
    }

    public Integer getDept_id() {
        return dept_id;
    }

    public void setDept_id(Integer dept_id) {
        this.dept_id = dept_id;
    }

    public Integer getDept_cat_id() {
        return dept_cat_id;
    }

    public void setDept_cat_id(Integer dept_cat_id) {
        this.dept_cat_id = dept_cat_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
