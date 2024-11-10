package com.huahuadan.pattern.prototype;

import java.io.Serializable;

public class CitationDeep implements Cloneable, Serializable {
    private Student stu;

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }

    void show() {
        System.out.println(stu.getName() + "同学：在2020学年第一学期中表现优秀，被评为三好学生。特发此状！");
    }

    @Override
    public CitationDeep clone() throws CloneNotSupportedException {
        return (CitationDeep) super.clone();
    }
}