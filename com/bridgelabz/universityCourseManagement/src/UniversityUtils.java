package com.bridgelabz.universityCourseManagement.src;

import java.util.List;

class UniversityUtils {
    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println(course);
        }
    }
}
