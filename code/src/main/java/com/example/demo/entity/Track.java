package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("track")
public class Track {
    /**
     * id自增列
     */
    @TableId(value = "id" , type = IdType.AUTO)
    private Integer id;

    /**
     * 空
     */
    private String kong;

    /**
     * tradm
     */
    private String tradm;

    /**
     * bankanglerad
     */
    private String bankanglerad;
}
