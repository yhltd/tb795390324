package com.example.demo.controller;

import com.example.demo.entity.Track;
import com.example.demo.entity.Track2;
import com.example.demo.service.Track2Service;
import com.example.demo.service.TrackService;
import com.example.demo.util.ResultInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/track")
public class TrackController {
    @Autowired
    TrackService trackService;
    @Autowired
    Track2Service track2Service;


    /**
     * 查询所有
     *
     * @return ResultInfo
     */
    @RequestMapping("/getList")
    public ResultInfo getList() {
        try {
            List<Track> getList = trackService.getList();
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
            List<Track2> getList = track2Service.getList();
            return ResultInfo.success("获取成功", getList);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("获取失败：{}", e.getMessage());
            return ResultInfo.error("错误!");
        }
    }
}


