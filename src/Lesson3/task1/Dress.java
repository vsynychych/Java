package Lesson3.task1;

public class Dress extends Clothes implements WomenClothes {

    public Dress() {
    }

    public Dress(Sizes sizes, int price, String color) {
        super(sizes, price, color);
    }

    @Override
    public void toDressAWoman() {
        System.out.println("Dress a woman");
    }


    @Override
    public String toString() {
        return "Dress: " + super.toString();
    }
}
