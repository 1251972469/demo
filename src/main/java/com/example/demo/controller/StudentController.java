package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.IStudentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;
import java.util.List;

@RequestMapping("/student")
@RestController
public class StudentController {
    @Resource
    private IStudentService studentService;

    @RequestMapping("/getAll")
    public List<Student> getAll(){
        return  studentService.getAll();
    }

    @PostMapping("/save")
    public Integer save(@RequestBody Student student){
        studentService.insert(student);
        return student.getId();
    }

    @GetMapping("/get")
    public Student get(Integer id){
        return studentService.getById(id);
    }
    @PostMapping ("/delete")
    public Integer delete(Integer id){
         studentService.delete(id);
         return id;
    }
    @RequestMapping("/update")
    public Integer update(@RequestBody Student student){
        studentService.update(student);
        return student.getId();
    }

        /*方法之上
//    @PostMapping
//    @GetMapping
//    @RequestHeader
@PathVariable
    @PathParam()

      参数修饰
//    @RequestBody
//    @RequestParam
*/






}
