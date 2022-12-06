package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("input3")
public class Input3 {
    /**
     * id自增列
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String A;

    private String B;

    private String C;

    private String D;

    private String E;

    private String F;
}
