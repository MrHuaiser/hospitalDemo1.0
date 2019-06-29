package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class dutytime {

    @Id
    @GeneratedValue
    private Integer duty_time_id;
    private String time_seg;
    private String day;

    public dutytime() {
    }

    public Integer getDuty_time_id() {
        return duty_time_id;
    }

    public void setDuty_time_id(Integer duty_time_id) {
        this.duty_time_id = duty_time_id;
    }

    public String getTime_seg() {
        return time_seg;
    }

    public void setTime_seg(String time_seg) {
        this.time_seg = time_seg;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
}
