package com.qf.controller;

import com.qf.entity.Classes;
import com.qf.entity.Student;
import com.qf.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/stu")
public class StudentController {

    @Autowired
    private IStuService stuService;

    @RequestMapping("/list")
    public String queryAllStudent(ModelMap map){
        System.out.println("进来了查询学生列表");
        List<Student> studentList = stuService.queryAllStudent();
        map.put("stuList",studentList);
        return "stuList";
    }
    @RequestMapping("/delOne/{id}")
    @ResponseBody
    public String delOne(@PathVariable Integer id){
        System.out.println("要删除的学生id为:"+id);
        stuService.delOneById(id);
        return "<script>alert('删除成功！');location.href='/stu/list';</script>";
    }

    @RequestMapping("/toUpdate/{id}")
    public String toUpdate(@PathVariable Integer id,ModelMap map){
        Student student = stuService.queryStuById(id);
        List<Classes> classList = stuService.getAllClasses();
        map.put("student",student);
        map.put("classList",classList);
        return "update";
    }
    @RequestMapping("/update")
    @ResponseBody
    public String update(Student student){
        int result = stuService.update(student);
        System.out.println("修改的结果为："+result);
        if(result>0){
            return "<script>alert('修改成功！');location.href='/stu/list';</script>";
        }else{
            return "<script>alert('修改失败！');location.href='/stu/list';</script>";
        }
    }

    @RequestMapping("/toAdd")
    public String toAdd(ModelMap map){
        List<Classes> classList = stuService.toAdd();
        map.put("classList",classList);
        return "addStu";
    }
    @RequestMapping("/add")
    @ResponseBody
    public String add(Student student){
        int result = stuService.addStudent(student);
        if(result>0){
            return "<script>alert('添加成功！');location.href='/stu/list';</script>";
        }else{
            return "<script>alert('添加失败！');location.href='/stu/list';</script>";
        }
    }
}
