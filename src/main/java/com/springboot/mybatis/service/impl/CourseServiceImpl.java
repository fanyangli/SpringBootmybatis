package com.springboot.mybatis.service.impl;

import com.springboot.mybatis.entity.Course;
import com.springboot.mybatis.mapper.CourseMapper;
import com.springboot.mybatis.service.CourseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2019/3/18.
 */
@Service
public class CourseServiceImpl implements CourseService{
    @Resource
    private CourseMapper courseMapper;

    @Override
    public List<Course> selectAll() {
        return courseMapper.selectAll();
    }

    @Override
    public Course getOne(Long courseId) {
        return  courseMapper.getOne(courseId);
    }

    @Override
    public void delete(Long courseId) {
        courseMapper.delete(courseId);

    }


}
