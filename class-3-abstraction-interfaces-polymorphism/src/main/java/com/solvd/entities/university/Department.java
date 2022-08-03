package com.solvd.entities.university;

import java.util.List;

public final class Department {
    private String type;
    private List<Major> majors;

    public Department(String type, List<Major> majors) {
        this.type = type;
        this.majors = majors;
    }

    public List<Major> getMajors() {
        return majors;
    }

    public void setMajors(List<Major> majors) {
        this.majors = majors;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString(Object obj) {
        return this.type;
    }

    public int getDepartmentTotalStudents() {
        int count = 0;
        for (Major m : majors) {
            count += m.getMajorTotalStudents();
        }
        return count;
    }
}
