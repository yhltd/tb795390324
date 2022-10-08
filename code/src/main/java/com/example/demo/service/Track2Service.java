package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.entity.Track2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Track2Service extends IService<Track2> {
    /**
     *  查询全部数据
     * */
    List<Track2> getList();
}
