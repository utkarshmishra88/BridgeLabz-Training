package com.generics.resumescreeningsystem;
class Resume<T extends JobRole> {

    private T jobRole;
    private String candidateName;

    public Resume(String candidateName, T jobRole) {
        this.candidateName = candidateName;
        this.jobRole = jobRole;
    }

    public void processResume() {
        System.out.println("\nCandidate: " + candidateName);
        System.out.println("Role Applied: " + jobRole.getRoleName());
        jobRole.screenResume();
    }

    public T getJobRole() {
        return jobRole;
    }
}
