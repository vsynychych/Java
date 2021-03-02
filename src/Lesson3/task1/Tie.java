package Lesson3.task1;

public class Tie extends Clothes implements MenClothes {

    public Tie() {
    }

    public Tie(Sizes sizes, int price, String color) {
        super(sizes, price, color);
    }

    @Override
    public void toDressAMan() {
        System.out.println("Tie");
    }


    @Override
    public String toString() {
        return "Tie: " + super.toString();
    }
}
