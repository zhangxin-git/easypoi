package com.mr.zxy.easypoi.controller;

import com.mr.zxy.easypoi.entity.EasyPoiEntity;
import com.mr.zxy.easypoi.service.EasyPoiService;
import com.mr.zxy.easypoi.utils.ExcelUtiles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @ClassNameTestController
 * @Description: TOOD
 * @Author zhangxinyu
 * @Date 2020/1/6
 * @Version V1.0
 **/
@RestController
@RequestMapping(value="test")
public class TestController {

    @Autowired
    private EasyPoiService service;

    @GetMapping
    public void test(HttpServletResponse response) {
       List<EasyPoiEntity> list =  service.list();
        try {
            ExcelUtiles.exportExcel(list,"测试信息表","测试信息",EasyPoiEntity.class,"测试信息",response);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @PostMapping
    public String importExcel(@RequestParam("file") MultipartFile file ) {

        try {
            String filename = file.getOriginalFilename();
            String suffixName = filename.substring(filename.lastIndexOf("."));
            if (suffixName.equalsIgnoreCase("xls") || suffixName.equalsIgnoreCase(".xlsx")){

                List<EasyPoiEntity> list = ExcelUtiles.importExcel(file, EasyPoiEntity.class);
                service.save(list);
            }else {
                return "文件类型错误";

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  "导入成功";
    }



}
