package com.example.one.domain;

import lombok.Data;

import java.util.Date;

/**
 * @Classname Student
 * @Description TODO
 * @Author Imai
 * @Date 2023/4/10 16:34
 * @Created by 61635
 */
@Data
public class Student {
    private Integer id;
    private Integer studentId;
    private String name;
    private String sex;
    private Integer age;
    private Integer classId;
    private String address;
    private Date createTime;
    private Date updateTime;
}
