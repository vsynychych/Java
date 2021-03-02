package Lesson3.task1;

//1. Створити енум, який містить розміри одягу (XXS, XS, S, M, ).
// Написати в ньому абстрактий метод getDescription.
// Додати в енум в поле int euroSize, написати конструктор, який параметром буде приймати значення для поля.

// 2. Створити інтерфейси "Чоловічий одяг" з методом "вдягнути чоловіка" і "Жіночий одяг" з методом "одягнути жінку".

// 3. Створити абстрактний клас Одяг, який має такі поля: розмір одягу (використати створений енум), вартість, колір.

// 4. Створити класи нащадки до класу Одяг:
// Футболка (реалізує також інтерфейси Чоловічий одяг і Жіночий одяг),
// Штани (реалізує також інтерфейси Чоловічий одяг і Жіночий одяг),
// Галстук (реалізуреалізує також інтерфейси Чоловічий одяг і Жіночий одяг),
// Плаття (реалізує інтерфейс "Жіночий одяг").

// 5. Створити клас Ательє, який має поле масив об'єктів Одяг (тобто в ньому можуть бути об'єкти усіх класів-нащадків),
// та 2 методи - чоловічий вибір (повертає увесь ЧОЛОВІЧИЙ одяг (підказка: instanceof оператор поможе))
// та жіночий вибір (повертає увесь ЖІНОЧИЙ одяг).

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Dress dress = new Dress(Sizes.M, 100, "red");
        Pants pants = new Pants(Sizes.XXL, 80, "blue");
        Tie tie = new Tie(Sizes.S, 30, "black");
        TShirt tShirt = new TShirt(Sizes.L, 60, "white");


        List<Clothes> clothes = new ArrayList<>();
        clothes.add(dress);
        clothes.add(pants);
        clothes.add(tie);
        clothes.add(tShirt);


        Atelier atelier = new Atelier(clothes.toArray(new Clothes[0]));
        atelier.menClothingChoices();
//        atelier.womenClothingChoices();

    }
}
