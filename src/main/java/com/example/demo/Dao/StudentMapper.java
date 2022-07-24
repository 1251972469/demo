package com.example.demo.Dao;

import com.example.demo.model.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {
    public Student getById(Integer id);
    public List<Student> getAll();
    public Integer insert(Student student);
    public int update(Student student);
    public int delete(Integer id);
}
