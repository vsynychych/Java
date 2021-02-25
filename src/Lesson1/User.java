package Lesson1;

public class User {
    private String name;
    private int age;
    private boolean children;
    private Wife wife;
    private Car car;

    public User() {
    }

    public User(String name, int age, boolean children, Wife wife, Car car) {
        this.name = name;
        this.age = age;
        this.children = children;
        this.wife = wife;
        this.car = car;
    }

    public User(String name, int age, boolean children, String nameWife, int ageWife, String[] skills, String producer,
                String model, int year, String color, String type, Engine engine) {
        this.name = name;
        this.age = age;
        this.children = children;
        this.wife = new Wife(nameWife, ageWife, skills);
        this.car = new Car(producer, model, year, color, type, engine);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setChildren(boolean children) {
        this.children = children;
    }

    public boolean getChildren() {
        return this.children;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }

    public Wife getWife() {
        return this.wife;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", children=" + children +
                ", wife=" + wife +
                ", car=" + car +
                '}';
    }
}
