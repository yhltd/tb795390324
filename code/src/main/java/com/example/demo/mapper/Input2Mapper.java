package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.Input;
import com.example.demo.entity.Input2;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface Input2Mapper extends BaseMapper<Input2> {
    @Select("select * from input2")
    List<Input2> getList();

    @Update("update input2 set ${column} = #{value} where id=#{id}")
    boolean save(String column, String value, int id);
}
