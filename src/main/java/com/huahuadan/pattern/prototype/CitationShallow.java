package com.huahuadan.pattern.prototype;

//奖状类
public class CitationShallow implements Cloneable {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return (this.name);
    }

    public void show() {
        System.out.println(name + "同学：在2020学年第一学期中表现优秀，被评为三好学生。特发此状！");
    }

    @Override
    public CitationShallow clone() throws CloneNotSupportedException {
        return (CitationShallow) super.clone();
    }
}