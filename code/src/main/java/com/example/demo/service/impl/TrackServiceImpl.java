package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.entity.Track;
import com.example.demo.mapper.TrackMapper;
import com.example.demo.service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrackServiceImpl extends ServiceImpl<TrackMapper, Track> implements TrackService {
    @Autowired
    TrackMapper trackMapper;

    @Override
    public List<Track> getList() {
        return trackMapper.getList();
    }
}
