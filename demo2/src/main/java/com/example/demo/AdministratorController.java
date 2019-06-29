package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdministratorController {
    private AdminModel adminModel = new AdminModel();

    @GetMapping("/login")
    public String login() {
        return adminModel.login();
    }

    @GetMapping("/view/schedule")
    public String viewSchedule() {
        return "管理员查看已有排班";
    }

    @GetMapping("/view/department")
    public String viewDepartment() {
        return "管理员查看所有科室列表，应为PostMapping请求";
    }

    @GetMapping("/search/department")
    public String searchDepartment() {
        return "管理员搜索某科室，应为PostMapping请求";
    }

    @GetMapping("/view/doctor")
    public String viewDoctor() {
        return "管理员查看所有医生列表";
    }

    @GetMapping("/search/doctor")
    public String searchDoctor() {
        return "管理员搜索某医生";
    }

    @GetMapping("/add/doctor")
    public String addDoctor() {
        return "管理员添加某医生，应为PostMapping请求";
    }

    @GetMapping("/update/doctor")
    public String updateDoctor() {
        return "管理员更新某医生信息，应为PostMapping请求";
    }

    @GetMapping("/add/department")
    public String addDepartment() {
        return "管理员添加某科室，应为PostMapping请求";
    }

    @GetMapping("/update/department")
    public String updateDepartment() {
        return "管理员更新某科室信息，应为PostMapping请求";
    }

    @GetMapping("/view/patients")
    public String viewPatients() {
        return "管理员查看所有病号列表";
    }

    @GetMapping("/view/patient")
    public String viewPatient() {
        return "管理员查看某病号，应为PostMapping请求";
    }

    @GetMapping("/view/reversations")
    public String viewReversations() {
        return "管理员查看所有预约列表";
    }

    @GetMapping("/view/reversation")
    public String viewReversation() {
        return "管理员查看某预约，应为PostMapping请求";
    }


}
