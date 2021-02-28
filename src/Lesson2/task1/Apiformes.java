package Lesson2.task1;

public class Apiformes extends Insecta{
    private String name;

    public Apiformes() {
    }

    public Apiformes(String group, String subGroup) {
        super(group, subGroup);
    }

    public Apiformes(String subclass, int numberOfSpecies, boolean areFoundInUkraine) {
        super(subclass, numberOfSpecies, areFoundInUkraine);
    }

    public Apiformes(String group, String subGroup, String subclass, int numberOfSpecies, boolean areFoundInUkraine) {
        super(group, subGroup, subclass, numberOfSpecies, areFoundInUkraine);
    }

    public Apiformes(String name) {
        this.name = name;
    }

    public Apiformes(String group, String subGroup, String name) {
        super(group, subGroup);
        this.name = name;
    }

    public Apiformes(String subclass, int numberOfSpecies, boolean areFoundInUkraine, String name) {
        super(subclass, numberOfSpecies, areFoundInUkraine);
        this.name = name;
    }

    public Apiformes(String group, String subGroup, String subclass, int numberOfSpecies, boolean areFoundInUkraine, String name) {
        super(group, subGroup, subclass, numberOfSpecies, areFoundInUkraine);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Apiformes{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}
