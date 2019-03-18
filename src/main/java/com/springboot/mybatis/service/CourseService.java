package com.springboot.mybatis.service;

import com.springboot.mybatis.entity.Course;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/3/18.
 */

public interface CourseService {
    List<Course> selectAll();

    Course getOne(Long courseId);

    void delete(Long courseId);

    Course insert(Course)
}
