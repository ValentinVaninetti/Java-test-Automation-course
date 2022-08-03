package com.solvd.entities.university;

import com.solvd.entities.person.Student;
import com.solvd.entities.person.Teacher;
import com.solvd.interfaces.university.IMajor;

import java.util.List;
import java.util.UUID;

public final class Major implements IMajor {
    private String id = UUID.randomUUID().toString();
    private String majorName;
    private List<Student> students;
    private List<Teacher> teachers;

    public Major(String majorName, List<Student> students, List<Teacher> teachers) {
        this.majorName = majorName;
        this.students = students;
        this.teachers = teachers;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    @Override
    public String toString() {
        return getClass().getName() + " of " + this.majorName + "\n" + "Students: " + this.students.toString();
    }

    public Student getStudentById(String id) {
        if (id != null) {
            for (Student s : students) {
                if (s.getId().equals(id)) {
                    return s;
                }
            }
        }
        return null;
    }

    public int countStudentsByStatus(String status) {
        if (this.students != null) {
            int total = 0;
            for (Student s : students) {
                if (s.getStatus().equals(status)) {
                    total++;
                }
            }
            return total;
        } else {
            return 0;
        }
    }

    public int getMajorTotalStudents() {
        if (this.students != null) {
            return this.students.size();
        } else {
            return 0;
        }
    }

    @Override
    public void careerProgress(Student student) {

    }
}
