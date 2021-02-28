package Lesson2.task2;

//        Cтворити клас ланцюг наслідування:
//        Папірус-Книга-Журнал
//        Папірус-Книга-Комікс
//        Кількість полів довільна.

public class Main {
    public static void main(String[] args) {
        Papyrus papyrus = new Papyrus("for writing and readind");
        System.out.println("1. Papyrus: "+ papyrus+";");

        Book book = new Book(
                "listen",
                "Robert Kiyosaki",
                "Rich Dad, Poor Dad",
                "audiobook",
                1997);
        System.out.println("2. Book: "+book+";");

        Journal journal = new Journal(
                "reading",
                "National Geographic Society",
                "National Geographic",
                "scientific journal",
                1888,
                "monthly");
        System.out.println("3. Journal: "+journal+";");

        Comics comics = new Comics(
                "reading",
                "Martyn Hudmen",
                "Marvel Comics",
                "illustrations",
                1939,
                "USA");
        System.out.println("4. Comics: "+comics+";");

    }
}
