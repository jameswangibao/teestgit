package com.xiangxue.jack.jpa.dao;

import com.xiangxue.jack.jpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/*
* Student操作对象
* Integer主键类型
*
* */
public interface StudentDao extends JpaRepository<Student,Integer> {

}

