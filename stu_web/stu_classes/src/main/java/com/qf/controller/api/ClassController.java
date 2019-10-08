package com.qf.controller.api;

import com.qf.entity.Classes;
import com.qf.service.IClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cls/api")
public class ClassController {

    @Autowired
    private IClassService classService;

    @RequestMapping("/queryByCid/{cid}")
    public Classes queryByCid(@PathVariable Integer cid){
        Classes classes = classService.queryByCid(cid);
        return classes;
    }
    @RequestMapping("/queryAllClasses")
    public List<Classes> queryAllClasses(){
        return classService.queryAll();
    }
}
