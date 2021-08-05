package com.moon.design.pattern.creational.v2;

public class Test {
    public static void main(String[] args) {
        Course course=new Course.CourseBuilder().buildCourseName("建造者").build();
        System.out.println(course);
    }
}
