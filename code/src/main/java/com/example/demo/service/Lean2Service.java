package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.entity.Lean2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Lean2Service extends IService<Lean2> {
    /**
     *  查询全部数据
     * */
    List<Lean2> getList();
}
