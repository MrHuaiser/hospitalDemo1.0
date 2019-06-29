package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Time;

@Entity
public class timesegment {
    @Id
    @GeneratedValue
    private String time_seg;

    private Time start_time;

    private Time end_time;

    public timesegment() {
    }

    public String getTime_seg() {
        return time_seg;
    }

    public void setTime_seg(String time_seg) {
        this.time_seg = time_seg;
    }

    public Time getStart_time() {
        return start_time;
    }

    public void setStart_time(Time start_time) {
        this.start_time = start_time;
    }

    public Time getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Time end_time) {
        this.end_time = end_time;
    }
}
