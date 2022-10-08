package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.entity.Input4;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Input4Service extends IService<Input4> {
    /**
     *  查询全部数据
     * */
    List<Input4> getList();

    /**
     *  即时修改
     * */
    boolean save(String column,String value,int id);
}
