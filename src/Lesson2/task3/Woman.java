package Lesson2.task3;

public class Woman implements WomenClothes {
    private String name;
    private String clothes;
    private boolean alreadyHas;

    public Woman() {
    }

    public Woman(String name, String clothes, boolean alreadyHas) {
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

    public boolean isToBe() {
        return alreadyHas;
    }

    public void setToBe(boolean toBe) {
        this.alreadyHas = toBe;
    }

    @Override
    public void toDressAWoman() {
        if (!this.alreadyHas) {
            System.out.println(name + " to put on a " + clothes + ".");
        } else {
            System.out.println(name + " already has a clothes.");
        }
    }

    @Override
    public String toString() {
        return "Woman{" +
                "name='" + name + '\'' +
                ", clothes='" + clothes + '\'' +
                ", toBe=" + alreadyHas +
                '}';
    }
}
