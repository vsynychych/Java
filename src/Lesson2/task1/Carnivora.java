package Lesson2.task1;

public class Carnivora extends Mammalia{
    private String name;

    public Carnivora() {
    }

    public Carnivora(String group, String subGroup) {
        super(group, subGroup);
    }

    public Carnivora(String subclass, String habitat, boolean areFoundInUkraine) {
        super(subclass, habitat, areFoundInUkraine);
    }

    public Carnivora(String group, String subGroup, String subclass, String habitat, boolean areFoundInUkraine) {
        super(group, subGroup, subclass, habitat, areFoundInUkraine);
    }

    public Carnivora(String name) {
        this.name = name;
    }

    public Carnivora(String group, String subGroup, String name) {
        super(group, subGroup);
        this.name = name;
    }

    public Carnivora(String subclass, String habitat, boolean areFoundInUkraine, String name) {
        super(subclass, habitat, areFoundInUkraine);
        this.name = name;
    }

    public Carnivora(String group, String subGroup, String subclass, String habitat, boolean areFoundInUkraine, String name) {
        super(group, subGroup, subclass, habitat, areFoundInUkraine);
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
        return "Carnivora{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}
