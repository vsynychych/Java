package Lesson2.task1;

public class Insecta extends Animal{
    private String subclass;
    private int numberOfSpecies;
    private boolean areFoundInUkraine;

    public Insecta() {
    }

    public Insecta(String group, String subGroup) {
        super(group, subGroup);
    }

    public Insecta(String subclass, int numberOfSpecies, boolean areFoundInUkraine) {
        this.subclass = subclass;
        this.numberOfSpecies = numberOfSpecies;
        this.areFoundInUkraine = areFoundInUkraine;
    }

    public Insecta(String group, String subGroup, String subclass, int numberOfSpecies, boolean areFoundInUkraine) {
        super(group, subGroup);
        this.subclass = subclass;
        this.numberOfSpecies = numberOfSpecies;
        this.areFoundInUkraine = areFoundInUkraine;
    }

    public String getSubclass() {
        return subclass;
    }

    public void setSubclass(String subclass) {
        this.subclass = subclass;
    }

    public int getNumberOfSpecies() {
        return numberOfSpecies;
    }

    public void setNumberOfSpecies(int numberOfSpecies) {
        this.numberOfSpecies = numberOfSpecies;
    }

    public boolean isAreFoundInUkraine() {
        return areFoundInUkraine;
    }

    public void setAreFoundInUkraine(boolean areFoundInUkraine) {
        this.areFoundInUkraine = areFoundInUkraine;
    }

    @Override
    public String toString() {
        return "Insecta{" +
                "subclass='" + subclass + '\'' +
                ", numberOfSpecies=" + numberOfSpecies +
                ", areFoundInUkraine=" + areFoundInUkraine +
                "} " + super.toString();
    }
}
