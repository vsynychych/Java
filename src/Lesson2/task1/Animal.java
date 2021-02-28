package Lesson2.task1;

public class Animal {
    private String group;
    private String subGroup;

    public Animal() {
    }

    public Animal(String group, String subGroup) {
        this.group = group;
        this.subGroup = subGroup;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getSubGroup() {
        return subGroup;
    }

    public void setSubGroup(String subGroup) {
        this.subGroup = subGroup;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "group='" + group + '\'' +
                ", subGroup='" + subGroup + '\'' +
                '}';
    }
}
