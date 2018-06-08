package com.xbd.demoapi.entity;
import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 0L;
    private String stuId;
    private String name;
    private int age;
    private int grade;

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
