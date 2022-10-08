package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.entity.Input3;
import com.example.demo.mapper.Input3Mapper;
import com.example.demo.service.Input3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Input3ServiceImpl extends ServiceImpl<Input3Mapper, Input3> implements Input3Service {
    @Autowired
    Input3Mapper input3Mapper;

    @Override
    public List<Input3> getList() {
        return input3Mapper.getList();
    }

    @Override
    public boolean save(String column, String value, int id) {
        return input3Mapper.save(column, value, id);
    }
}
