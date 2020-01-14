package com.mr.zxy.easypoi.service;

import com.mr.zxy.easypoi.entity.EasyPoiEntity;

import java.util.List;

public interface EasyPoiService {


    List<EasyPoiEntity> list();


    void save(List<EasyPoiEntity> list);
}
