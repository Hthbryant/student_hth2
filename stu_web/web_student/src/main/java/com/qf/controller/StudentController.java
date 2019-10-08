package com.qf.controller;

import com.qf.entity.Student;
import com.qf.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/stu")
public class StudentController {

    @Autowired
    private IStuService stuService;

    @RequestMapping("/list")
    public String queryAllStudent(ModelMap map){
        List<Student> studentList = stuService.queryAllStudent();
        map.put("stuList",studentList);
        return "stuList";
    }
}
