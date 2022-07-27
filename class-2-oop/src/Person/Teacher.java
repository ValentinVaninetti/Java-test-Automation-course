package Person;

public class Teacher extends Person {

    private int experience;

    public Teacher(String name, int id, int experience) {
        super(name, id);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString(){
    return this.getName() + "has" + this.getExperience() + "Years of Experience";
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
