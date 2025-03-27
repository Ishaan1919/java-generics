package com.bridgelabz.universityCourseManagement.src;

public class UniversityCourseManagement {
    public static void main(String[] args) {
        Course<ExamCourse> examCourses = new Course<>("Computer Science");
        examCourses.addCourse(new ExamCourse("Data Structures"));
        examCourses.addCourse(new ExamCourse("Algorithms"));

        Course<AssignmentCourse> assignmentCourses = new Course<>("Business Administration");
        assignmentCourses.addCourse(new AssignmentCourse("Marketing Strategies"));
        assignmentCourses.addCourse(new AssignmentCourse("Financial Analysis"));

        Course<ResearchCourse> researchCourses = new Course<>("Physics");
        researchCourses.addCourse(new ResearchCourse("Quantum Mechanics"));
        researchCourses.addCourse(new ResearchCourse("Astrophysics"));

        System.out.println("Exam-Based Courses:");
        UniversityUtils.displayCourses(examCourses.getCourses());

        System.out.println("\nAssignment-Based Courses:");
        UniversityUtils.displayCourses(assignmentCourses.getCourses());

        System.out.println("\nResearch-Based Courses:");
        UniversityUtils.displayCourses(researchCourses.getCourses());
    }
}
