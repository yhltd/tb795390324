package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.entity.Input7;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Input7Service extends IService<Input7> {
    List<Input7> getList();
}
