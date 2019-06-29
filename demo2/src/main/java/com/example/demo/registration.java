package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.criteria.CriteriaBuilder;
import java.time.DateTimeException;

@Entity
public class registration {
    @Id
    @GeneratedValue
    private String reg_id;

    private Integer pat_id;

    private String doc_id;

    private Integer duty_time_id;

    private DateTimeException time;

    private Integer state;

    public registration() {
    }

    public String getReg_id() {
        return reg_id;
    }

    public void setReg_id(String reg_id) {
        this.reg_id = reg_id;
    }

    public Integer getPat_id() {
        return pat_id;
    }

    public void setPat_id(Integer pat_id) {
        this.pat_id = pat_id;
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

    public DateTimeException getTime() {
        return time;
    }

    public void setTime(DateTimeException time) {
        this.time = time;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
