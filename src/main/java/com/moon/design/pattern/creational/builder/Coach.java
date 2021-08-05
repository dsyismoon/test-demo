package com.moon.design.pattern.creational.builder;

public class Coach {
    private CourseBuilder courseBuilder;

    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }
    public Course makeCourse(String courseName,String coursePPT,String courseVideo,
            String courseArticle, String courseQA){
        this.courseBuilder.builderCourseName(courseName);
        this.courseBuilder.buildercoursePPT(coursePPT);
        this.courseBuilder.buildercourseVideo(courseVideo);
        this.courseBuilder.buildercourseArticle(courseArticle);
        this.courseBuilder.buildercourseQA(courseQA);

        return this.courseBuilder.makeCourse();
    }
}
