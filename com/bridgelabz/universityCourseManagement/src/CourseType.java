package com.bridgelabz.universityCourseManagement.src;

abstract class CourseType {
    private String courseName;

    public CourseType(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + courseName;
    }
}
