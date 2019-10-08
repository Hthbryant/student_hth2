package com.qf.service.impl;

import com.qf.dao.StuMapper;
import com.qf.entity.Classes;
import com.qf.entity.Student;
import com.qf.feign.ClsFeign;
import com.qf.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StuServiceImpl implements IStuService {

    @Autowired
    private StuMapper stuMapper;
    @Autowired
    private ClsFeign clsFeign;

    @Override
    public List<Student> queryAllStudent() {
        List<Student> students = stuMapper.selectList(null);
        for (Student stu : students) {
            Classes classes = clsFeign.queryByCid(stu.getCid());
            stu.setClasses(classes);
        }
        return  students;
    }
}
