package com.moon.design.pattern.creational.builder;

public abstract class CourseBuilder {
//    private String courseName;
//    private String coursePPT;
//    private String courseVideo;
//    private String courseArticle;
//
//    private String courseQA;
    public abstract void builderCourseName(String courseName);
    public abstract void buildercoursePPT(String coursePPT);
    public abstract void buildercourseVideo(String courseVideo);
    public abstract void buildercourseArticle(String courseArticle);
    public abstract void buildercourseQA(String courseQA);

    public abstract  Course makeCourse();
}
