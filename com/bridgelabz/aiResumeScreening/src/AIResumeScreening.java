package com.bridgelabz.aiResumeScreening.src;

public class AIResumeScreening {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> softwareEngineerResumes = new Resume<>();
        softwareEngineerResumes.addCandidate(new SoftwareEngineer("Alice Johnson", "Java, Spring Boot, AWS"));
        softwareEngineerResumes.addCandidate(new SoftwareEngineer("Bob Smith", "Python, Django, Docker"));

        Resume<DataScientist> dataScientistResumes = new Resume<>();
        dataScientistResumes.addCandidate(new DataScientist("Charlie Brown", "Python, Machine Learning, SQL"));
        dataScientistResumes.addCandidate(new DataScientist("Dana White", "R, Deep Learning, NLP"));

        Resume<ProductManager> productManagerResumes = new Resume<>();
        productManagerResumes.addCandidate(new ProductManager("Eve Adams", "Agile, Market Analysis, UX"));
        productManagerResumes.addCandidate(new ProductManager("Frank Castle", "Leadership, Product Roadmaps, Strategy"));

        System.out.println("\nSoftware Engineer Candidates:");
        ResumeScreeningSystem.screenCandidates(softwareEngineerResumes.getCandidates());

        System.out.println("\nData Scientist Candidates:");
        ResumeScreeningSystem.screenCandidates(dataScientistResumes.getCandidates());

        System.out.println("\nProduct Manager Candidates:");
        ResumeScreeningSystem.screenCandidates(productManagerResumes.getCandidates());
    }
}

