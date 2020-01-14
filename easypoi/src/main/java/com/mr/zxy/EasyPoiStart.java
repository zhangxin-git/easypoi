package com.mr.zxy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassNameEasyPoiStart
 * @Description: TOOD
 * @Author zhangxinyu
 * @Date 2020/1/6
 * @Version V1.0
 **/
@SpringBootApplication
@MapperScan(value = "com.mr.zxy.*.mapper")
public class EasyPoiStart {

    public static void main(String[] args) {

        SpringApplication.run(EasyPoiStart.class);

    }

}
