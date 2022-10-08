package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.entity.Lean;
import com.example.demo.mapper.LeanMapper;
import com.example.demo.service.LeanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeanServiceImpl extends ServiceImpl<LeanMapper, Lean> implements LeanService {
    @Autowired
    LeanMapper leanMapper;

    @Override
    public List<Lean> getList() {
        return leanMapper.getList();
    }
}
