package com.example.one.dao;

import com.example.one.domain.Student;
import com.example.one.domain.StudentInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author imai
 * @since 2021/4/11 8:48 下午
 */
@Mapper
public interface StudentMapper {
    List<Student> select();
    int insert(Student student);
    void delete(int id);
    int update(Student student);
    List<StudentInfo> selectStudentInfo();
}
