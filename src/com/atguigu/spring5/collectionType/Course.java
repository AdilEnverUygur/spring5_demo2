package com.atguigu.spring5.collectionType;

//课程类
public class Course {
    private String cName;
    public void setcName(String cName) {
        this.cName = cName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cName='" + cName + '\'' +
                '}';
    }
}
