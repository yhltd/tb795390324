package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.entity.Input5;
import com.example.demo.mapper.Input5Mapper;
import com.example.demo.service.Input5Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Input5ServiceImpl extends ServiceImpl<Input5Mapper, Input5> implements Input5Service {
    @Autowired
    Input5Mapper input5Mapper;

    @Override
    public List<Input5> getList() {
        return input5Mapper.getList();
    }

    @Override
    public boolean save(String column, String value, int id) {
        return input5Mapper.save(column, value, id);
    }
}
