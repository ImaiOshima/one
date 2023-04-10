package com.example.one.controller;

import com.example.one.dao.StudentMapper;
import com.example.one.domain.Student;
import com.example.one.domain.StudentInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @Classname StudentController
 * @Description TODO
 * @Author Imai
 * @Date 2023/4/10 16:33
 * @Created by 61635
 */
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentMapper studentMapper;
    @GetMapping("/select")

    public List<Student> select(){
        return studentMapper.select();
    }

    @PostMapping("/insert")
    public void insert(@RequestBody Student student){
        student.setCreateTime(new Date());
        student.setUpdateTime(new Date());
        studentMapper.insert(student);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id){
        studentMapper.delete(id);
    }

    @PostMapping("/update")
    public void update(@RequestBody Student student){
        student.setCreateTime(new Date());
        student.setUpdateTime(new Date());
        studentMapper.update(student);
    }


    @GetMapping("/StudentInfo")
    public List<StudentInfo> studentInfo(){
        return studentMapper.selectStudentInfo();
    }
}
