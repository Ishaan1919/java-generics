package com.bridgelabz.universityCourseManagement.src;

import java.util.ArrayList;
import java.util.List;

class Course<T extends CourseType> {
    private String department;
    private List<T> courses = new ArrayList<>();

    public Course(String department) {
        this.department = department;
    }

    public void addCourse(T course) {
        courses.add(course);
    }

    public List<T> getCourses() {
        return courses;
    }
}