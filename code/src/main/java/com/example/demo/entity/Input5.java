package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("input5")
public class Input5 {
    /**
     * id自增列
     */
    @TableId(value = "id" , type = IdType.AUTO)
    private Integer id;

    private String G;

    private String H;

    private String I;

    private String J;

    private String K;

    private String L;

    private String M;

    private String N;

    private String O;

    private String P;

    private String Q;

    private String R;

    private String S;

    private String T;

    private String U;

    private String V;

    private String W;

    private String X;

    private String Y;

    private String Z;

    private String AA;
}
