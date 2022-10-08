package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.entity.Input2;
import com.example.demo.entity.Input3;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Input3Service extends IService<Input3> {
    /**
     *  查询全部数据
     * */
    List<Input3> getList();

    /**
     *  即时修改
     * */
    boolean save(String column,String value,int id);
}
