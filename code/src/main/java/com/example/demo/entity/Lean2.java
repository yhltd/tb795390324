package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("lean2")
public class Lean2 {
    /**
     * id自增列
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * AU
     */
    private String AU;

    /**
     * AV
     */
    private String AV;
}
