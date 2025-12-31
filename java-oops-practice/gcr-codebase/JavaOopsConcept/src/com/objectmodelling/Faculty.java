package com.objectmodelling;

class Faculty {
    private int facultyId;
    private String name;

    public Faculty(int facultyId, String name) {
        this.facultyId = facultyId;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void displayFaculty() {
        System.out.println("Faculty ID: " + facultyId + ", Name: " + name);
    }
}
