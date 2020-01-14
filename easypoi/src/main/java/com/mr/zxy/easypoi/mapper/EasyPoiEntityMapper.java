package com.mr.zxy.easypoi.mapper;

import com.mr.zxy.easypoi.entity.EasyPoiEntity;

import java.util.List;

public interface EasyPoiEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EasyPoiEntity record);

    int insertSelective(EasyPoiEntity record);

    EasyPoiEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EasyPoiEntity record);

    int updateByPrimaryKey(EasyPoiEntity record);

    List<EasyPoiEntity> list();

    void save(List<EasyPoiEntity> list);
}