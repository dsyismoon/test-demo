package com.moon.design.pattern.creational.builder;

import com.moon.design.pattern.creational.builder.Coach;
import com.moon.design.pattern.creational.builder.Course;
import com.moon.design.pattern.creational.builder.CourseActualbuilder;
import com.moon.design.pattern.creational.builder.CourseBuilder;

public class Test {
    public static void main(String[] args) {
        CourseBuilder courseBuilder =new CourseActualbuilder();
        Coach coach=new Coach();
        coach.setCourseBuilder(courseBuilder);
        Course course=coach.makeCourse("java建造者模式",
               "java建造者模式PPT","java建造者模式Video",
                "java建造者模式Article","java建造者模式QA");
        System.out.println(course);
    }
}
