package Lesson1;

public class Main {
    public static void main(String[] args) {

        String[] skills = new String[3];
        skills[0] = "html";
        skills[1] = "css";
        skills[2] = "bootstrap";
        Wife wife = new Wife("Marta", 20, skills);

        Engine engine = new Engine(3, 290);
        Car car = new Car("audi", "a8", 2012, "black", "sedan", engine);


        User userComposition = new User("Oleg", 24, false, wife, car);
        System.out.println(userComposition);


        User userAggregtion = new User("Alex",
                30,
                true,
                "Nastia",
                25,
                new String[]{"JS", "React", "Node.js"},
                "vw",
                "eos",
                2008,
                "blue",
                "cabriolet",
                new Engine(2, 110));
        System.out.println(userAggregtion);
    }
}
