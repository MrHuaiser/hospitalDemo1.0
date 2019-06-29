package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class registrationlimit {
    @Id
    @GeneratedValue
    private Integer dept_id;

    private Integer duty_time_id;

    private Integer limit;

    public registrationlimit() {
    }

    public Integer getDept_id() {
        return dept_id;
    }

    public void setDept_id(Integer dept_id) {
        this.dept_id = dept_id;
    }

    public Integer getDuty_time_id() {
        return duty_time_id;
    }

    public void setDuty_time_id(Integer duty_time_id) {
        this.duty_time_id = duty_time_id;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
