package University;

import java.util.List;

public class University {
    private String name;
    private String location;

    private List<Department> departmentList;

    public University(String name, String location, List<Department>departmentList) {
        this.name = name;
        this.location = location;
        this.departmentList = departmentList;
    }

    public List<Department> getDepartmentList() {
        return departmentList;
    }

    public void setDepartmentList(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int countStudentsByStatus(String status){
        int departmentListSize = departmentList.size();
        int countAllStudents = 0;
        for(int i = 0; i < departmentListSize;i++){
            if(departmentList.get(i).getMajors() != null){
               countAllStudents +=  departmentList.get(i).countStudents(status);
            }
        }
    return countAllStudents;
    }
}
