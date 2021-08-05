package com.moon.design.pattern.creational.v2;

public class Course {
    private String courseName;
    private String coursePPT;
    private String courseVideo;
    private String courseArticle;

    private String courseQA;

    public Course(CourseBuilder courseBuilder) {
        this.courseName=courseBuilder.courseName;
        this.coursePPT=courseBuilder.coursePPT;
        this.courseVideo =courseBuilder.courseVideo;
        this.courseArticle =courseBuilder.courseArticle;
        this.courseQA=courseBuilder.courseQA;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", coursePPT='" + coursePPT + '\'' +
                ", courseVideo='" + courseVideo + '\'' +
                ", courseArticle='" + courseArticle + '\'' +
                ", courseQA='" + courseQA + '\'' +
                '}';
    }
    public static class CourseBuilder{
        private String courseName;
        private String coursePPT;
        private String courseVideo;
        private String courseArticle;

        private String courseQA;

        public CourseBuilder buildCourseName(String courseName){
            this.courseName=courseName;
            return this;
        }

        public CourseBuilder buildercoursePPT(String coursePPT) {
            this.coursePPT=coursePPT;
            return this;
        }


        public CourseBuilder buildercourseVideo(String courseVideo) {
            this.courseVideo=courseVideo;
            return this;
        }


        public CourseBuilder buildercourseArticle(String courseArticle) {
            this.courseArticle=courseArticle;
            return this;
        }


        public CourseBuilder buildercourseQA(String courseQA) {
            this.courseQA=courseQA;
            return this;
        }
        public Course build(){
            return new Course(this);
        }

    }
}
