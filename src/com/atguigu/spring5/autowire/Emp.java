package com.atguigu.spring5.autowire;

public class Emp {
    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "dpt=" + dept +
                '}';
    }

    public void test(){
        System.out.println(dept);
    }
}
