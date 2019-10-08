package com.qf.feign;

import com.qf.entity.Classes;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient("web-classes")
public interface ClsFeign {

    @RequestMapping("/cls/api/queryByCid/{cid}")
    Classes queryByCid(@PathVariable Integer cid);
}
