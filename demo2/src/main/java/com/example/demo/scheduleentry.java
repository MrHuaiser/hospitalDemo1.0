package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class scheduleentry {
    @Id
    @GeneratedValue
    private String doc_id;

    private Integer duty_time_id;

    public scheduleentry() {
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
}
