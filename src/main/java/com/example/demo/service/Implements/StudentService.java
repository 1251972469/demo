package com.example.demo.service.Implements;

import com.example.demo.Dao.StudentMapper;
import com.example.demo.model.Student;
import com.example.demo.service.IStudentService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class StudentService implements IStudentService {

    @Resource
    StudentMapper studentMapper;
    @Override
    public Student getById(int id) {
        return studentMapper.getById(id);
    }

    @Override
    public List<Student> getAll() {
        return studentMapper.getAll();
    }

    @Override
    public Integer insert(Student student) {
        return studentMapper.insert(student);
    }

    @Override
    public int update(Student student) {
        return studentMapper.update(student);
    }

    @Override
    public int delete(int id) {
        return studentMapper.delete(id);
    }
}
