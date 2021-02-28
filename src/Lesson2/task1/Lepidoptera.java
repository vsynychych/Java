package Lesson2.task1;

public class Lepidoptera extends Insecta{
    private String name;

    public Lepidoptera() {
    }

    public Lepidoptera(String group, String subGroup) {
        super(group, subGroup);
    }

    public Lepidoptera(String subclass, int numberOfSpecies, boolean areFoundInUkraine) {
        super(subclass, numberOfSpecies, areFoundInUkraine);
    }

    public Lepidoptera(String group, String subGroup, String subclass, int numberOfSpecies, boolean areFoundInUkraine) {
        super(group, subGroup, subclass, numberOfSpecies, areFoundInUkraine);
    }

    public Lepidoptera(String name) {
        this.name = name;
    }

    public Lepidoptera(String group, String subGroup, String name) {
        super(group, subGroup);
        this.name = name;
    }

    public Lepidoptera(String subclass, int numberOfSpecies, boolean areFoundInUkraine, String name) {
        super(subclass, numberOfSpecies, areFoundInUkraine);
        this.name = name;
    }

    public Lepidoptera(String group, String subGroup, String subclass, int numberOfSpecies, boolean areFoundInUkraine, String name) {
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
        return "Lepidoptera{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}
