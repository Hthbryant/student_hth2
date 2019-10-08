package com.qf.service;

import com.qf.entity.Classes;

import java.util.List;

public interface IClassService {

    Classes queryByCid(Integer cid);

    List<Classes> queryAll();
}
