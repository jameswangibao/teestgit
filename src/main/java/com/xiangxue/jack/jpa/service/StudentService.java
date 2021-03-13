package com.xiangxue.jack.jpa.service;


import com.xiangxue.jack.jpa.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> findAll();

    Student findById(Integer id);

    Integer save(Student student);
}
