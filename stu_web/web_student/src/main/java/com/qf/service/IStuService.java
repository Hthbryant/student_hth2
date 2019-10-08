package com.qf.service;

import com.qf.entity.Classes;
import com.qf.entity.Student;

import java.util.List;

public interface IStuService {
    List<Student> queryAllStudent();

    int delOneById(Integer id);

    Student queryStuById(Integer id);

    List<Classes> getAllClasses();

    int update(Student student);

    List<Classes> toAdd();

    int addStudent(Student student);
}
