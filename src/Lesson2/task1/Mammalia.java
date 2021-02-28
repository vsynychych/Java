package Lesson2.task1;

public class Mammalia extends Animal{
    private String subclass;
    private String habitat;
    private boolean areFoundInUkraine;

    public Mammalia() {
    }

    public Mammalia(String group, String subGroup) {
        super(group, subGroup);
    }

    public Mammalia(String subclass, String habitat, boolean areFoundInUkraine) {
        this.subclass = subclass;
        this.habitat = habitat;
        this.areFoundInUkraine = areFoundInUkraine;
    }

    public Mammalia(String group, String subGroup, String subclass, String habitat, boolean areFoundInUkraine) {
        super(group, subGroup);
        this.subclass = subclass;
        this.habitat = habitat;
        this.areFoundInUkraine = areFoundInUkraine;
    }

    public String getSubclass() {
        return subclass;
    }

    public void setSubclass(String subclass) {
        this.subclass = subclass;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public boolean isAreFoundInUkraine() {
        return areFoundInUkraine;
    }

    public void setAreFoundInUkraine(boolean areFoundInUkraine) {
        this.areFoundInUkraine = areFoundInUkraine;
    }

    @Override
    public String toString() {
        return "Mammalia{" +
                "subclass='" + subclass + '\'' +
                ", habitat='" + habitat + '\'' +
                ", areFoundInUkraine=" + areFoundInUkraine +
                "} " + super.toString();
    }
}
