package com.mr.zxy.easypoi.service.impl;

import com.mr.zxy.easypoi.entity.EasyPoiEntity;
import com.mr.zxy.easypoi.mapper.EasyPoiEntityMapper;
import com.mr.zxy.easypoi.service.EasyPoiService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassNameEasyPoiService
 * @Description: TOOD
 * @Author zhangxinyu
 * @Date 2020/1/6
 * @Version V1.0
 **/
@Service
public class EasyPoiServiceImpl implements EasyPoiService {

    @Resource
    private EasyPoiEntityMapper mapper;

    @Override
    public List<EasyPoiEntity> list() {

        return mapper.list();
    }

    @Override
    public void save(List<EasyPoiEntity> list) {

        mapper.save(list);

    }
}
