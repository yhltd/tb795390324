package com.example.demo.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.entity.Lean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LeanService extends IService<Lean> {
    /**
     *  查询全部数据
     * */
    List<Lean> getList();
}
