package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.Input5;
import com.example.demo.entity.Input6;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface Input6Mapper extends BaseMapper<Input6> {
    @Select("select * from input6")
    List<Input6> getList();

    @Update("update input6 set ${column} = #{value} where id=#{id}")
    boolean save(String column,String value,int id);


}
