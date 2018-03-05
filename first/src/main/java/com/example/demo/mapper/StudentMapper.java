package com.example.demo.mapper;

import com.example.demo.domain.Student;


public interface StudentMapper {
    Student selectByPrimaryKey(String id);

}