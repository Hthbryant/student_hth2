package com.qf.service.impl;

import com.qf.dao.ClassMapper;
import com.qf.entity.Classes;
import com.qf.service.IClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassServiceImpl implements IClassService {

    @Autowired
    private ClassMapper classMapper;

    @Override
    public Classes queryByCid(Integer cid) {
        Classes classes = classMapper.selectById(cid);
        return classes;
    }
}
