package Lesson1;

import java.util.Arrays;

public class Wife {
    private String name;
    private int age;
    private String[] skills;

    public Wife() {
    }

    public Wife(String name, int age, String[] skills) {
        this.name = name;
        this.age = age;
        this.skills = skills;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public String[] getSkills() {

        return skills;
    }

    public void setSkills(String[] skills) {

        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Wife{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", skills=" + Arrays.toString(skills) +
                '}';
    }
}


