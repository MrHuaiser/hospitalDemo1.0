package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ordinary")
public class OrdinayController {
    private OrdinaryUserModel ordinaryuserModel = new OrdinaryUserModel();

    @GetMapping("/add/user")
    public String addUser() {
        return "普通用户注册，应为PostMapping请求";
    }

    @GetMapping("/login")
    public String login() {
        return ordinaryuserModel.login() + "，应为PostMapping请求";
    }

    @GetMapping("/view/doctors")
    public String viewDoctors() {
        return "普通用户查看医生列表";
    }

    @GetMapping("/view/doctor")
    public String viewDoctor() {
        return "普通用户选中某医生点击查看某医生信息，应为PostMapping请求";
    }

    @GetMapping("/search/doctor")
    public String searchDoctor() {
        return "普通用户通过搜索框搜索某个医生，应为PostMapping请求";
    }

    @GetMapping("/view/department")
    public String viewDepartment() {
        return "普通用户查看科室列表";
    }

    @GetMapping("/add/reversation")
    public String addReversation() {
        return "用户点击某医生进行预约，应为PostMapping请求";
    }

    @GetMapping("/cancle/reversation")
    public String cancleReversation() {
        return "用户取消某预约，应为PostMapping请求";
    }

    @GetMapping("/search/reversation")
    public String searchReversation() {
        return "用户查看自己的预约预约，应为PostMapping请求";
    }

    @GetMapping("/add/patient")
    public String addPatient() {
        return "用户增加病号信息，应为PostMapping请求";
    }

    @GetMapping("/update/patient")
    public String updatePatient() {
        return "用户更新某病号信息，应为PostMapping请求";
    }

    @GetMapping("/delete/patient")
    public String deletePatient() {
        return "用户删除某病号信息，应为PostMapping请求";
    }

    @GetMapping("/view/schedule")
    public String viewSchedule() {
        return "用户点击查看某医生排班信息，应为PostMapping请求";
    }


}
