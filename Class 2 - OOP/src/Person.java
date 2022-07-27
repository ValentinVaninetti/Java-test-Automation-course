abstract class Person {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public boolean equals(Object person) {
       /* return this.name.equals(((Person) person).getName()); // Casting Object to Person.*/
        return (this.name == ((Person)person).getName() && this.id == ((Person)person).getId());


    }
    @Override
    public int hashCode() {
        return this.id;
    }

}
