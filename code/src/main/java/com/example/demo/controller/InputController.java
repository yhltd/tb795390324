package com.example.demo.controller;

import com.example.demo.entity.*;
import com.example.demo.service.*;
import com.example.demo.util.ResultInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/input")
public class InputController {
    @Autowired
    InputService inputService;
    @Autowired
    Input2Service input2Service;
    @Autowired
    Input3Service input3Service;
    @Autowired
    Input4Service input4Service;
    @Autowired
    Input5Service input5Service;
    @Autowired
    Input6Service input6Service;
    @Autowired
    Input7Service input7Service;

    /**
     * 查询所有
     *
     * @return ResultInfo
     */
    @RequestMapping("/getList")
    public ResultInfo getList() {
        try {
            List<Input> getList = inputService.getList();
            return ResultInfo.success("获取成功", getList);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("获取失败：{}", e.getMessage());
            return ResultInfo.error("错误!");
        }
    }

    /**
     * 即时修改
     */
    @RequestMapping("/save")
    public ResultInfo save(String column, int id, String value, HttpSession session) {
        try {
            if (inputService.save(column,value,id)) {
                return ResultInfo.success("修改成功");
            } else {
                return ResultInfo.success("修改失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            log.error("修改失败：{}", e.getMessage());
            return ResultInfo.error("修改失败");
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
            List<Input2> getList = input2Service.getList();
            return ResultInfo.success("获取成功", getList);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("获取失败：{}", e.getMessage());
            return ResultInfo.error("错误!");
        }
    }

    /**
     * 即时修改
     */
    @RequestMapping("/save2")
    public ResultInfo save2(String column, int id, String value, HttpSession session) {
        try {
            if (input2Service.save(column,value,id)) {
                return ResultInfo.success("修改成功");
            } else {
                return ResultInfo.success("修改失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            log.error("修改失败：{}", e.getMessage());
            return ResultInfo.error("修改失败");
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
            List<Input3> getList = input3Service.getList();
            return ResultInfo.success("获取成功", getList);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("获取失败：{}", e.getMessage());
            return ResultInfo.error("错误!");
        }
    }

    /**
     * 即时修改
     */
    @RequestMapping("/save3")
    public ResultInfo save3(String column, int id, String value, HttpSession session) {
        try {
            if (input3Service.save(column,value,id)) {
                return ResultInfo.success("修改成功");
            } else {
                return ResultInfo.success("修改失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            log.error("修改失败：{}", e.getMessage());
            return ResultInfo.error("修改失败");
        }
    }

    /**
     * 查询所有
     *
     * @return ResultInfo
     */
    @RequestMapping("/getList4")
    public ResultInfo getList4() {
        try {
            List<Input4> getList = input4Service.getList();
            return ResultInfo.success("获取成功", getList);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("获取失败：{}", e.getMessage());
            return ResultInfo.error("错误!");
        }
    }

    /**
     * 即时修改
     */
    @RequestMapping("/save4")
    public ResultInfo save4(String column, int id, String value, HttpSession session) {
        try {
            if (input4Service.save(column,value,id)) {
                return ResultInfo.success("修改成功");
            } else {
                return ResultInfo.success("修改失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            log.error("修改失败：{}", e.getMessage());
            return ResultInfo.error("修改失败");
        }
    }

    /**
     * 查询所有
     *
     * @return ResultInfo
     */
    @RequestMapping("/getList5")
    public ResultInfo getList5() {
        try {
            List<Input5> getList = input5Service.getList();
            return ResultInfo.success("获取成功", getList);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("获取失败：{}", e.getMessage());
            return ResultInfo.error("错误!");
        }
    }

    /**
     * 即时修改
     */
    @RequestMapping("/save5")
    public ResultInfo save5(String column, int id, String value, HttpSession session) {
        try {
            if (input5Service.save(column,value,id)) {
                return ResultInfo.success("修改成功");
            } else {
                return ResultInfo.success("修改失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            log.error("修改失败：{}", e.getMessage());
            return ResultInfo.error("修改失败");
        }
    }

    /**
     * 查询所有
     *
     * @return ResultInfo
     */
    @RequestMapping("/getList6")
    public ResultInfo getList6() {
        try {
            List<Input6> getList = input6Service.getList();
            return ResultInfo.success("获取成功", getList);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("获取失败：{}", e.getMessage());
            return ResultInfo.error("错误!");
        }
    }

    /**
     * 即时修改
     */
    @RequestMapping("/save6")
    public ResultInfo save6(String column, int id, String value, HttpSession session) {
        try {
            if (input6Service.save(column,value,id)) {
                return ResultInfo.success("修改成功");
            } else {
                return ResultInfo.success("修改失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            log.error("修改失败：{}", e.getMessage());
            return ResultInfo.error("修改失败");
        }
    }

    /**
     * 查询所有
     *
     * @return ResultInfo
     */
    @RequestMapping("/getList7")
    public ResultInfo getList7() {
        try {
            List<Input7> getList = input7Service.getList();
            return ResultInfo.success("获取成功", getList);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("获取失败：{}", e.getMessage());
            return ResultInfo.error("错误!");
        }
    }
}
