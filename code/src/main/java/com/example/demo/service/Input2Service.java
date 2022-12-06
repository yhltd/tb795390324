package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.entity.Input2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Input2Service extends IService<Input2> {
    /**
     * 查询全部数据
     */
    List<Input2> getList();

    /**
     * 即时修改
     */
    boolean save(String column, String value, int id);
}
