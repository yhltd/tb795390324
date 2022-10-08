package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.Input;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface InputMapper extends BaseMapper<Input> {
    @Select("select * from input")
    List<Input> getList();

    @Update("update input set ${column} = #{value} where id=#{id}")
    boolean save(String column,String value,int id);
}
