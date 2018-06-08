package com.xbd.demoapi.service;

import com.xbd.demoapi.entity.RetMessage;
import com.xbd.demoapi.entity.Student;

public interface DemoApi {
    public Student getInfoById(String Id);
    public RetMessage insertInfo(Student stu);
    public RetMessage deleteById(String Id);
}
