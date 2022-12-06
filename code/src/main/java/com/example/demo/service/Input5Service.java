package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.entity.Input5;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Input5Service extends IService<Input5> {
    /**
     * 查询全部数据
     */
    List<Input5> getList();

    /**
     * 即时修改
     */
    boolean save(String column, String value, int id);

    boolean insert(String G, String H, String I, String J, String K, String L, String M, String N, String O,
                   String P, String Q, String R, String S, String T, String U, String V, String W, String X,
                   String Y, String Z, String AA, String AB, String AC, String AD, String AE, String AF,
                   String AG, String AH, String AI, String AJ, String AK, String AL, String AM, String AN,
                   String AO);

    boolean delete(List<Integer> idList);
}
