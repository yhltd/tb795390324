package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.entity.Input6;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Input6Service extends IService<Input6> {
    List<Input6> getList();

    boolean save(String column,String value,int id);
}
