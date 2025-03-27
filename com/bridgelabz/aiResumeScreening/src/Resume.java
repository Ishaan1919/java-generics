package com.bridgelabz.aiResumeScreening.src;

import java.util.ArrayList;
import java.util.List;

class Resume<T extends JobRole> {
    private List<T> candidates = new ArrayList<>();

    public void addCandidate(T candidate) {
        candidates.add(candidate);
    }

    public List<T> getCandidates() {
        return candidates;
    }
}
