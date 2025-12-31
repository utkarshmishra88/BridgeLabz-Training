package com.objectmodelling;

class Professor {
    private int profId;
    private String name;

    public Professor(int profId, String name) {
        this.profId = profId;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Communication method
    public void assignProfessor(Course1 course) {
        course.setProfessor(this);
        System.out.println("Prof. " + name + " assigned to " + course.getCourseName());
    }
}


