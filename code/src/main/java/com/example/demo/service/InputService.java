package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.entity.Input;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface InputService extends IService<Input> {
    /**
     * 查询全部数据
     */
    List<Input> getList();

    /**
     * 即时修改
     */
    boolean save(String column, String value, int id);
}
