package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.entity.Input2;
import com.example.demo.mapper.Input2Mapper;
import com.example.demo.service.Input2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Input2ServiceImpl extends ServiceImpl<Input2Mapper, Input2> implements Input2Service {
    @Autowired
    Input2Mapper input2Mapper;

    @Override
    public List<Input2> getList() {
        return input2Mapper.getList();
    }

    @Override
    public boolean save(String column, String value, int id) {
        return input2Mapper.save(column, value, id);
    }
}
