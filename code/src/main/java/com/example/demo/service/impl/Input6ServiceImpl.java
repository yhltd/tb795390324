package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.entity.Input6;
import com.example.demo.mapper.Input6Mapper;
import com.example.demo.service.Input6Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Input6ServiceImpl extends ServiceImpl<Input6Mapper, Input6> implements Input6Service {
    @Autowired
    Input6Mapper input6Mapper;

    @Override
    public List<Input6> getList() {
        return input6Mapper.getList();
    }

    @Override
    public boolean save(String column, String value, int id) {
        return input6Mapper.save(column, value, id);
    }
}
