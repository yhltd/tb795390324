package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.entity.Input4;
import com.example.demo.mapper.Input4Mapper;
import com.example.demo.service.Input4Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Input4ServiceImpl extends ServiceImpl<Input4Mapper, Input4> implements Input4Service {
    @Autowired
    Input4Mapper input4Mapper;

    @Override
    public List<Input4> getList() {
        return input4Mapper.getList();
    }

    @Override
    public boolean save(String column, String value, int id) {
        return input4Mapper.save(column, value, id);
    }
}
