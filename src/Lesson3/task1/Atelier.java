package Lesson3.task1;
// 5. Створити клас Ательє, який має поле масив об'єктів Одяг (тобто в ньому можуть бути об'єкти усіх класів-нащадків),
// та 2 методи - чоловічий вибір (повертає увесь ЧОЛОВІЧИЙ одяг (підказка: instanceof оператор поможе))
// та жіночий вибір (повертає увесь ЖІНОЧИЙ одяг).

import java.util.Arrays;

public class Atelier {

    private Clothes[] clothes;

    public Atelier(Clothes[] clothes) {
        this.clothes = clothes;
    }

    public Clothes[] getClothes() {
        return clothes;
    }

    public void setClothes(Clothes[] clothes) {
        this.clothes = clothes;
    }

    public Clothes menClothingChoices() {
        for (Clothes item : clothes) {
            if (item instanceof MenClothes) {
                System.out.println(item);
            }
        }
        return null;
    }


    public Clothes womenClothingChoices() {
        for (Clothes item : clothes) {
            if (item instanceof WomenClothes) {
                System.out.println(item);
            }
        }
        return null;
    }


    @Override
    public String toString() {
        return "Atelier{" +
                "clothes=" + Arrays.toString(clothes) +
                '}';
    }
}

