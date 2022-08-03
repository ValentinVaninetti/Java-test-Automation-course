package com.solvd.entities.university;

import java.util.List;

abstract class University {
    protected String name;
    protected String location;
    protected List<Department> departmentList;

    public University(String name, String location, List<Department> departmentList) {
        this.name = name;
        this.location = location;
        this.departmentList = departmentList;
    }

    protected List<Department> getDepartmentList() {
        return departmentList;
    }

    protected void setDepartmentList(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    protected void setLocation(String location) {
        this.location = location;
    }

    protected String getLocation() {
        return location;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public int countAllStudents() {
        int countAllStudents = 0;
        for (Department d : departmentList) {
            countAllStudents += d.getDepartmentTotalStudents();
        }
        return countAllStudents;
    }
}
