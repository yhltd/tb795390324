package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.entity.Calcs;
import com.example.demo.mapper.CalcsMapper;
import com.example.demo.service.CalcsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalcsServiceImpl extends ServiceImpl<CalcsMapper, Calcs> implements CalcsService {
    @Autowired
    CalcsMapper calcsMapper;


    @Override
    public List<Calcs> getList() {
        return calcsMapper.getList();
    }

    @Override
    public boolean add(Calcs calcs) {
        return save(calcs);
    }

    @Override
    public boolean delete(List<Integer> idList) {
        return removeByIds(idList);
    }
}
