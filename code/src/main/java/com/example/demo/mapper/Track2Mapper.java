package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.Track;
import com.example.demo.entity.Track2;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface Track2Mapper extends BaseMapper<Track2> {
    @Select("select * from track2")
    List<Track2> getList();
}
