package com.wqs.example.controller;

import com.wqs.example.mapper.TOrderMapper;
import com.wqs.example.pojo.TOrder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Optional;

/**
 * @author: wangqisong
 * @date: 2019/9/3
 * @Description:
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    TOrderMapper orderMapper;

    @GetMapping(value = "/hello")
    public String hello() {
        return "hello world";
    }

    @PostMapping("/insertOrder")
    public ResponseEntity insertOrder(TOrder torder) {
        int i = orderMapper.insertOrder(torder);
        String msg=null;
        if (i>0){
            msg="insert success，id："+torder.getId();
        }else{
            msg="insert failed："+i;
        }
        return ResponseEntity.ok().body(msg);
    }

    @GetMapping("/findOrderById/{id}")
    public ResponseEntity findOrderById(@PathVariable("id") Integer id) {
        Optional<TOrder> oneOrderById = orderMapper.findOneOrderById(id);
        if (oneOrderById.isPresent()){
            TOrder tOrder = oneOrderById.get();
            return ResponseEntity.ok(tOrder);
        }else{
            return ResponseEntity.ok().body("no data");
        }

    }
}
