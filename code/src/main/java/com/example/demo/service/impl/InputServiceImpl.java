package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.entity.Input;
import com.example.demo.mapper.InputMapper;
import com.example.demo.service.InputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InputServiceImpl extends ServiceImpl<InputMapper, Input> implements InputService {
    @Autowired
    InputMapper inputMapper;

    @Override
    public List<Input> getList() {
        return inputMapper.getList();
    }

    @Override
    public boolean save(String column, String value, int id) {
        return inputMapper.save(column, value, id);
    }
}
