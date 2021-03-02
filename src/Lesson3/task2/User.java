package Lesson3.task2;

public class User {
    private int id;
    private String name;
    private int age;
    private Gender gender;

    public User() {
    }

    public User(int id, String name, int age, Gender gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        if (this.name.length()>5){
            return name;
        }
        return "null";
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User_"+id+"{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
