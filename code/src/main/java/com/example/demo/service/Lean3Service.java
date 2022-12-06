package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.entity.Lean2;
import com.example.demo.entity.Lean3;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Lean3Service extends IService<Lean3> {
    /**
     * 查询全部数据
     */
    List<Lean3> getList();
}
