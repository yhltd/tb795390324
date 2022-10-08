package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.entity.Track2;
import com.example.demo.mapper.Track2Mapper;
import com.example.demo.service.Track2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Track2ServiceImpl extends ServiceImpl<Track2Mapper, Track2> implements Track2Service {
    @Autowired
    Track2Mapper track2Mapper;

    @Override
    public List<Track2> getList() {
        return track2Mapper.getList();
    }
}
