package Lesson5.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Person {
    private int id;
    private String name;
    private List<Pet> pets = new ArrayList<>();

    public Person() {
    }


    public Person(String name) {
        this.name = name;
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person(int id, String name, List<Pet> pets) {
        this.id = id;
        this.name = name;
        this.pets = pets;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name) && Objects.equals(pets, person.pets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, pets);
    }

    @Override
    public String toString() {
        return "Person - "+id+" {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pets";
    }
}
