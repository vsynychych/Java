package Lesson2.task3;

//        Створити інтерфейси"Чоловічий одяг"з методом"вдягнути чоловіка"і"Жіночий одяг"з методом"одягнути жінку".
//        Реалізувати їх у відповідних класах реалізаторах

public class Main {
    public static void main(String[] args) {

        Man man = new Man("Oleg", "pants", true);
        Woman woman = new Woman("Nastia", "coat", false);

        checkClothes(man, woman);
    }

    public static void checkClothes(MenClothes menClothes, WomenClothes womenClothes) {
        menClothes.toDressAMan();
        womenClothes.toDressAWoman();
    }
}
