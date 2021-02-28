package Lesson2.task3;

public class Man implements MenClothes {
    private String name;
    private String clothes;
    private boolean alreadyHas;

    public Man() {
    }

    public Man(String name, String clothes, boolean alreadyHas) {
        this.name = name;
        this.clothes = clothes;
        this.alreadyHas = alreadyHas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClothes() {
        return clothes;
    }

    public void setClothes(String clothes) {
        this.clothes = clothes;
    }

    public boolean isAlreadyHas() {
        return alreadyHas;
    }

    public void setAlreadyHas(boolean alreadyHas) {
        this.alreadyHas = alreadyHas;
    }

    @Override
    public void toDressAMan() {
        if (!alreadyHas) {
            System.out.println("To dress a " + name + " in " + clothes + ".");
        } else {
            System.out.println(name + " already has a clothes.");
        }
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", clothes='" + clothes + '\'' +
                ", toBe=" + alreadyHas +
                '}';
    }
}
