package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class patient {
    @Id
    @GeneratedValue
    private Integer pat_id;

    private String ord_usr_id;

    private String id_num;

    private String name;

    private String tel;

    private String gender;

    private Date birth;

    private String addr;

    private String med_hist;

    public patient() {
    }

    public Integer getPat_id() {
        return pat_id;
    }

    public void setPat_id(Integer pat_id) {
        this.pat_id = pat_id;
    }

    public String getOrd_usr_id() {
        return ord_usr_id;
    }

    public void setOrd_usr_id(String ord_usr_id) {
        this.ord_usr_id = ord_usr_id;
    }

    public String getId_num() {
        return id_num;
    }

    public void setId_num(String id_num) {
        this.id_num = id_num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getMed_hist() {
        return med_hist;
    }

    public void setMed_hist(String med_hist) {
        this.med_hist = med_hist;
    }
}
