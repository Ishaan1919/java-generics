package com.bridgelabz.aiResumeScreening.src;

import java.util.List;

class ResumeScreeningSystem {
    public static void screenCandidates(List<? extends JobRole> candidates) {
        System.out.println("Screening Candidates:");
        for (JobRole candidate : candidates) {
            System.out.println(candidate);
        }
    }
}
