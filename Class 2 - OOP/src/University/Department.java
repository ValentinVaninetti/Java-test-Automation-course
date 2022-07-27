package University;

import java.util.List;

public class Department {
    private String type;
    private List <Major> majors;


    public Department(String type, List <Major> majors) {

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

    public String toString(Object obj){
        return this.type;
    }

    public int countStudents(String status){

        int majorListSize = majors.size();
        int count = 0;

       for(int i = 0; i < majorListSize; i++){
           if(majors.get(i).getStudents() != null) {
               int studentListSize = majors.get(i).getStudents().size();
               for (int j = 0; j < studentListSize; j++) {
                   if (majors.get(i).getStudents().get(j).getStatus() == status) {
                       count++;
                   }
               }
           }
        }
        return count;
    }






}
