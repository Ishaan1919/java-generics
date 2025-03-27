package com.bridgelabz.aiResumeScreening.src;

abstract class JobRole {
    private String candidateName;
    private String skills;

    public JobRole(String candidateName, String skills) {
        this.candidateName = candidateName;
        this.skills = skills;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public String getSkills() {
        return skills;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " - Candidate: " + candidateName + ", Skills: " + skills;
    }
}
