package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.entity.Track;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TrackService extends IService<Track> {
    /**
     *  获取所有数据
     * */
    List<Track> getList();


}
