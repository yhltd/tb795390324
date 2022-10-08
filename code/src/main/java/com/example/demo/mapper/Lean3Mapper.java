package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.Lean2;
import com.example.demo.entity.Lean3;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface Lean3Mapper extends BaseMapper<Lean3> {
    @Select("select * from lean3")
    List<Lean3> getList();
}
