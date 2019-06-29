package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class departmentcategory {
    @Id
    @GeneratedValue
    private Integer dept_cat_id;

    private String name;

    public departmentcategory() {
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
}
