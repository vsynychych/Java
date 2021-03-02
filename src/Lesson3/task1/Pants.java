package Lesson3.task1;

public class Pants extends Clothes implements MenClothes, WomenClothes {

    public Pants() {
    }

    public Pants(Sizes sizes, int price, String color) {
        super(sizes, price, color);
    }

    @Override
    public void toDressAMan() {
        System.out.println("Pants a man");
    }

    @Override
    public void toDressAWoman() {
        System.out.println("Pants a woman");
    }

    @Override
    public String toString() {
        return "Pants: " + super.toString();
    }
}
