package com.example.demo.controller;

import com.example.demo.domain.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by MR.SJ on 2018/3/2.
 */
@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @RequestMapping("/student/getStudentById")
    public Object getStudentById(){
        Student student=studentService.getStudentById("1");
        if(student!=null){
            return student;
        }
        return "<h1>hhhhh</h1>";
    }
}
