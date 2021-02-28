package Lesson2.task1;

//        Створити клас Тварина з двома довільними полями.
//        від класу Тварина створити ще два нащадки,кожен з яких має свій набір додаткових полів,
//        від кожного нащядка ще по 2нащадки,кожен з яких має додатково по одній характеристиці.
//        Створити по одному елементу кожного типу.Створити масив кожного типу,
//        пофасувати всі елементи по можливих масивах,які підходять їм за типом

public class Main {
    public static void main(String[] args) {

        Primates lemur = new Primates(
                "Vertebrates",
                "Mammalia",
                "Primates",
                "forests",
                false,
                "Lemur"
        );

        Carnivora wolf = new Carnivora(
                "Vertebrates",
                "Mammalia",
                "Carnivora",
                "forests",
                true,
                "wolf"
        );

        Apiformes bee = new Apiformes(
                "Invertebrates",
                "Insecta",
                "Apiformes",
                2000,
                true,
                "Apis"
        );

        Lepidoptera butterfly = new Lepidoptera(
                "Invertebrates",
                "Insecta",
                "Lepidoptera",
                158570,
                false,
                "Greta oto"
        );

        Animal[] animal = new Animal[4];
        animal[0] = lemur;
        animal[1] = wolf;
        animal[2] = bee;
        animal[3] = butterfly;

        Mammalia[] mammal = new Mammalia[2];
        mammal[0] = lemur;
        mammal[1] = wolf;

        Insecta[] insect = new Insecta[2];
        insect[0] = bee;
        insect[1] = butterfly;

        Primates[] primate = new Primates[1];
        primate[0] = lemur;

        Carnivora[] carnivora = new Carnivora[1];
        carnivora[0] = wolf;

        Apiformes[] bees = new Apiformes[1];
        bees[0] = bee;

        Lepidoptera[] butterflies = new Lepidoptera[2];
        butterflies[0] = butterfly;

    }
}
