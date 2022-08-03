package com.solvd.entities.person;

import java.util.UUID;

abstract class Person {
    private String name;
    private final String id = UUID.randomUUID().toString();

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public boolean equals(Object person) {
        if (person instanceof Person) {
            return (this.name.equals(((Person) person).getName()) && this.id.equals(((Person) person).getId()));
        } else {
            return false;
        }
    }

}
