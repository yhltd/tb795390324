package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.Input4;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface Input4Mapper extends BaseMapper<Input4> {
    @Select("select * from input4")
    List<Input4> getList();

    @Update("update input4 set ${column} = #{value} where id=#{id}")
    boolean save(String column, String value, int id);
}
