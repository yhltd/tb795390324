package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.entity.Input5;
import com.example.demo.mapper.Input5Mapper;
import com.example.demo.service.Input5Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Input5ServiceImpl extends ServiceImpl<Input5Mapper, Input5> implements Input5Service {
    @Autowired
    Input5Mapper input5Mapper;

    @Override
    public List<Input5> getList() {
        return input5Mapper.getList();
    }

    @Override
    public boolean save(String column, String value, int id) {
        return input5Mapper.save(column, value, id);
    }

    @Override
    public boolean insert(String G, String H, String I, String J, String K, String L, String M, String N, String O, String P, String Q, String R, String S, String T, String U, String V, String W, String X, String Y, String Z, String AA, String AB, String AC, String AD, String AE, String AF, String AG, String AH, String AI, String AJ, String AK, String AL, String AM, String AN, String AO) {
        return input5Mapper.insert(G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z, AA, AB, AC, AD, AE, AF, AG, AH, AI, AJ, AK, AL, AM, AN, AO);
    }


    @Override
    public boolean delete(List<Integer> idList) {
        return removeByIds(idList);
    }


}
