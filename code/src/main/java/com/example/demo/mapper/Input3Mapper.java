package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.Input2;
import com.example.demo.entity.Input3;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface Input3Mapper extends BaseMapper<Input3> {
    @Select("select * from input3")
    List<Input3> getList();

    @Update("update input3 set ${column} = #{value} where id=#{id}")
    boolean save(String column, String value, int id);
}
