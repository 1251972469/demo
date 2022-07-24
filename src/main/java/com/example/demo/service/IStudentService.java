package com.example.demo.service;

import com.example.demo.model.Student;

import java.util.List;

public interface IStudentService  {
    public Student getById(int id);
    public List<Student> getAll();
    public Integer insert(Student student);
    public int update(Student student);
    public int delete(int id);
}
