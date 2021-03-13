package Lesson5.task1;

import java.util.Objects;

public class Pet {
    private String breed;
    private String name;

    public Pet() {
    }

    public Pet(String breed, String name) {
        this.breed = breed;
        this.name = name;
    }

    public Pet(String dog) {
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return Objects.equals(breed, pet.breed) && Objects.equals(name, pet.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(breed, name);
    }

    @Override
    public String toString() {
        return
                breed + " - " + name;
    }
}
