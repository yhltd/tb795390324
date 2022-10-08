package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.Input4;
import com.example.demo.entity.Input5;
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
    boolean save(String column,String value,int id);

}
