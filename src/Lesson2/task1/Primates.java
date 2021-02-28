package Lesson2.task1;

public class Primates extends Mammalia{
    private String name;

    public Primates() {
    }

    public Primates(String group, String subGroup) {
        super(group, subGroup);
    }

    public Primates(String subclass, String habitat, boolean areFoundInUkraine) {
        super(subclass, habitat, areFoundInUkraine);
    }

    public Primates(String group, String subGroup, String subclass, String habitat, boolean areFoundInUkraine) {
        super(group, subGroup, subclass, habitat, areFoundInUkraine);
    }

    public Primates(String name) {
        this.name = name;
    }

    public Primates(String group, String subGroup, String name) {
        super(group, subGroup);
        this.name = name;
    }

    public Primates(String subclass, String habitat, boolean areFoundInUkraine, String name) {
        super(subclass, habitat, areFoundInUkraine);
        this.name = name;
    }

    public Primates(String group, String subGroup, String subclass, String habitat, boolean areFoundInUkraine, String name) {
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
        return "Primates{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}
