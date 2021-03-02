package Lesson3.task1;

public class TShirt extends Clothes implements MenClothes, WomenClothes {

    public TShirt() {
    }

    public TShirt(Sizes sizes, int price, String color) {
        super(sizes, price, color);
    }

    @Override
    public void toDressAMan() {
        System.out.println("T-Shirt a man");
    }

    @Override
    public void toDressAWoman() {
        System.out.println("T-Shirt a woman");
    }

    @Override
    public String toString() {
        return "TShirt: " + super.toString();
    }
}
