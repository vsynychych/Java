package Lesson3.task1;

public abstract class Clothes {
    private Sizes sizes;
    private int price;
    private String color;

    public Clothes() {
    }

    public Clothes(Sizes sizes, int price, String color) {
        this.sizes = sizes;
        this.price = price;
        this.color = color;
    }

    public Sizes getSizes() {
        return sizes;
    }

    public void setSizes(Sizes sizes) {
        this.sizes = sizes;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return
                "sizes=" + sizes +
                        ", price=" + price +
                        ", color='" + color + "';";
    }
}
