package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.entity.Lean3;
import com.example.demo.mapper.Lean3Mapper;
import com.example.demo.service.Lean3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Lean3ServiceImpl extends ServiceImpl<Lean3Mapper, Lean3> implements Lean3Service {
    @Autowired
    Lean3Mapper lean3Mapper;

    @Override
    public List<Lean3> getList() {
        return lean3Mapper.getList();
    }


}
