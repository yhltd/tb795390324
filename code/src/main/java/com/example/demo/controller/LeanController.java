package com.example.demo.controller;

import com.example.demo.entity.Lean;
import com.example.demo.entity.Lean2;
import com.example.demo.entity.Lean3;
import com.example.demo.service.Lean2Service;
import com.example.demo.service.Lean3Service;
import com.example.demo.service.LeanService;
import com.example.demo.util.ResultInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/lean")
public class LeanController {
    @Autowired
    LeanService leanService;
    @Autowired
    Lean2Service lean2Service;
    @Autowired
    Lean3Service lean3Service;

    /**
     * 查询所有
     *
     * @return ResultInfo
     */
    @RequestMapping("/getList")
    public ResultInfo getList() {
        try {
            List<Lean> getList = leanService.getList();
            return ResultInfo.success("获取成功", getList);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("获取失败：{}", e.getMessage());
            return ResultInfo.error("错误!");
        }
    }

    /**
     * 查询所有
     *
     * @return ResultInfo
     */
    @RequestMapping("/getList2")
    public ResultInfo getList2() {
        try {
            List<Lean2> getList = lean2Service.getList();
            return ResultInfo.success("获取成功", getList);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("获取失败：{}", e.getMessage());
            return ResultInfo.error("错误!");
        }
    }

    /**
     * 查询所有
     *
     * @return ResultInfo
     */
    @RequestMapping("/getList3")
    public ResultInfo getList3() {
        try {
            List<Lean3> getList = lean3Service.getList();
            return ResultInfo.success("获取成功", getList);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("获取失败：{}", e.getMessage());
            return ResultInfo.error("错误!");
        }
    }

}
