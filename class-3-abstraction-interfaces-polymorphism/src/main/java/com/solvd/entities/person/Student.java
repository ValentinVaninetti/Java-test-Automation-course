package com.solvd.entities.person;

public class Student extends Person {
    private String career;
    private String status;

    public Student(String name, String career, String status) {
        super(name);
        this.career = career;
        this.status = status;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student : " + this.getName() + "With id: " + this.getId() + "its/ it has: " + this.status + "This career: " + this.career;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            return ((this.getName().equals(((Student) obj).getName())) && (this.getId().equals(((Student) obj).getId())));
        } else {
            return false;
        }
    }

}
