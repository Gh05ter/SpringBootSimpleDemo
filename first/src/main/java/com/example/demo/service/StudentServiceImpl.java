package com.example.demo.service;

import com.example.demo.domain.Student;
import com.example.demo.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by MR.SJ on 2018/3/2.
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public Student getStudentById(String id){
        return studentMapper.selectByPrimaryKey(id);
    }
}
