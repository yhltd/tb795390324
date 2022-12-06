package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.entity.Calcs;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CalcsService extends IService<Calcs> {
    /**
     * 获取所有数据
     */
    List<Calcs> getList();

    /**
     * 添加数据
     */
    boolean add(Calcs calcs);

    /**
     * 批量删除
     */
    boolean delete(List<Integer> idList);
}
