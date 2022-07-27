package University;

import Person.Student;
import Person.Teacher;

import java.util.List;

public class Major {
    private int id;
    private String majorName;
    private List<Student> students;
    private List<Teacher> teachers;

    public Major(int id, String majorName, List<Student> students, List<Teacher> teachers) {
        this.id = id;
        this.majorName = majorName;
        this.students = students;
        this.teachers = teachers;
    }
    public Major(int id, String majorName, List<Teacher> teachers){ // in case theres a new Major without students.
        this.id = id;
        this.majorName = majorName;
        this.students = null;
        this.teachers = teachers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public Student getStudentById(int id) {
        for (Student s : students
        ) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }


    public int countStudentsByStatus(String status) {
        if(this.students != null) {
            int total = 0;
            for (Student s : students
            ) {
                if (s.getStatus().equals(status)) {
                    total++;
                }
            }
            return total;
        }else {
            return 0;
        }
    }
}
