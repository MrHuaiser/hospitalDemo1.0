package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
    private DoctorModel doctorModel = new DoctorModel();

    @GetMapping("/login")
    public String login() {
        return doctorModel.login();
    }

    @GetMapping("/search/schedule")
    public String searchSchedule() {
        return "医生查看自己的出诊时间安排，应为PostMapping请求";
    }

    @GetMapping("/search/reversattion")
    public String searchReversation() {
        return "医生查看自己的预约安排，应为PostMapping请求";
    }

    @GetMapping("search/patient")
    public String searchPatient() {
        return "医生查看自己的病人，应为PostMapping请求";
    }

    @PostMapping("/search/my")
    public String searchMy() {
        return "医生查看自己的信息，应为PostMapping请求";
    }
}
