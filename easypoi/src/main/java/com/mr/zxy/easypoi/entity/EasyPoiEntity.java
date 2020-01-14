package com.mr.zxy.easypoi.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;

import java.util.Date;

public class EasyPoiEntity {
    private Integer id;
    @Excel(name = "姓名", orderNum = "0", width = 15)
    private String name;
    @Excel(name = "性别",replace = {"男_1","女_2"},orderNum = "1", width = 15)
    private Integer sex;
    @Excel(name = "生日", orderNum = "2", width = 15,format = "yyyy-MM-dd")
    private Date birthday;
    @Excel(name = "手机", orderNum = "3", width = 15)
    private Integer phone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }
}