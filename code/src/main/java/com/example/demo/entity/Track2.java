package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("track2")
public class Track2 {
    /**
     * id自增列
     */
    @TableId(value = "id" , type = IdType.AUTO)
    private Integer id;

    /**
     * H
     */
    private String H;

    /**
     * I
     */
    private String I;

    /**
     * J
     */
    private String J;

    /**
     * K
     */
    private String K;

    /**
     * L
     */
    private String L;

    /**
     * M
     */
    private String M;

    /**
     * N
     */
    private String N;

    /**
     * O
     */
    private String O;

    /**
     * P
     */
    private String P;

    /**
     * Q
     */
    private String Q;

    /**
     * R
     */
    private String R;
}
