package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.Input4;
import com.example.demo.entity.Input5;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface Input5Mapper extends BaseMapper<Input5> {
    @Select("select * from input5")
    List<Input5> getList();

    @Update("update input5 set ${column} = #{value} where id=#{id}")
    boolean save(String column, String value, int id);

    @Insert("insert into input5 (G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z,AA,AB,AC,AD,AE,AF,AG,AH,AI,AJ,AK,AL,AM,AN,AO) " +
            "values(#{G},#{H},#{I},#{J},#{K},#{L},#{M},#{N},#{O},#{P},#{Q},#{R},#{S},#{T}," +
            "#{U},#{V},#{W},#{X},#{Y},#{Z},#{AA},#{AB},#{AC},#{AD},#{AE},#{AF},#{AG},#{AH},#{AI},#{AJ},#{AK}" +
            ",#{AL},#{AM},#{AN},#{AO} )  ")
    boolean insert(String G, String H, String I, String J, String K, String L, String M, String N, String O,
                   String P, String Q, String R, String S, String T, String U, String V, String W, String X,
                   String Y, String Z, String AA, String AB, String AC, String AD, String AE, String AF,
                   String AG, String AH, String AI, String AJ, String AK, String AL, String AM, String AN,
                   String AO);

}
