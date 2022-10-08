package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.entity.Input7;
import com.example.demo.mapper.Input7Mapper;
import com.example.demo.service.Input7Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Input7ServiceImpl extends ServiceImpl<Input7Mapper, Input7> implements Input7Service {
    @Autowired
    Input7Mapper input7Mapper;

    @Override
    public List<Input7> getList() {
        return input7Mapper.getList();
    }
}
