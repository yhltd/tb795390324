package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.entity.Lean2;
import com.example.demo.mapper.Lean2Mapper;
import com.example.demo.service.Lean2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Lean2ServiceImpl extends ServiceImpl<Lean2Mapper, Lean2> implements Lean2Service {
    @Autowired
    Lean2Mapper lean2Mapper;

    @Override
    public List<Lean2> getList() {
        return lean2Mapper.getList();
    }
}
