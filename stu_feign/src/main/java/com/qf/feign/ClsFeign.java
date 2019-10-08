package com.qf.feign;

import com.qf.entity.Classes;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Component
@FeignClient("web-classes")
public interface ClsFeign {

    @RequestMapping("/cls/api/queryByCid/{cid}")
    Classes queryByCid(@PathVariable Integer cid);

    @RequestMapping("/cls/api/queryAllClasses")
    List<Classes> queryAllClasses();
}
