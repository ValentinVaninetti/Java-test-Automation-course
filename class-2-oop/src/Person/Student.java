package Person;

public class Student extends Person {
    private String career;
    private String status;

    public Student(String name, int id, String career, String status) {
        super(name, id);
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
    public String toString(){
        return "Student : " +this.getName() + "With id: "+ this.getId() + "its/ it has: " +this.status + "This career: " +this.career;
    }

    @Override
    public boolean equals(Object obj){
        return ((this.getName() == ((Student)obj).getName()) && (this.getId() == ((Student)obj).getId()));
    }

    @Override
    public int hashCode(){
        return this.getId();
    }



}
