package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class temporaryscheduleentry {
    @Id
    @GeneratedValue
    private String doc_id;

    private Integer duty_time_id;

    private Date date;

    private Integer is_absent;

    private String desc;

    public temporaryscheduleentry() {
    }

    public String getDoc_id() {
        return doc_id;
    }

    public void setDoc_id(String doc_id) {
        this.doc_id = doc_id;
    }

    public Integer getDuty_time_id() {
        return duty_time_id;
    }

    public void setDuty_time_id(Integer duty_time_id) {
        this.duty_time_id = duty_time_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getIs_absent() {
        return is_absent;
    }

    public void setIs_absent(Integer is_absent) {
        this.is_absent = is_absent;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
