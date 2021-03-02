package Lesson3.task2;

// Створити енум Стать.
// Створити клас Юзер з плоями : ід, ім'я , вік, Стать.
// Ствроити 10 об'єктів Юзера з відповідними ід (1-10)
// Свторити  arrayList , та покласти цих юзерів в arayList.
//   - Проітерувати колекцію юзерів, вивевши тільки юзерів з парним значенням ід
//   - Проітерувати колекцію юзерів, вивевши тільки юзерів з ім'ям , довжина якого більше ніж 5 символів
//   - Проітерувати колекцію юзерів, вивевши тільки юзерів жінок

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(1, "Oleg", 20, Gender.Male);
        User user2 = new User(2, "Taras", 18, Gender.Male);
        User user3 = new User(3, "Olena", 30, Gender.Female);
        User user4 = new User(4, "Maks", 27, Gender.Male);
        User user5 = new User(5, "Oksana", 12, Gender.Female);
        User user6 = new User(6, "Marta", 21, Gender.Female);
        User user7 = new User(7, "Ivan", 29, Gender.Male);
        User user8 = new User(8, "Roman", 18, Gender.Male);
        User user9 = new User(9, "Lilia", 29, Gender.Female);
        User user10 = new User(10, "Anastasia", 35, Gender.Female);

        ArrayList<User> user = new ArrayList<>();
        user.add(user1);
        user.add(user2);
        user.add(user3);
        user.add(user4);
        user.add(user5);
        user.add(user6);
        user.add(user7);
        user.add(user8);
        user.add(user9);
        user.add(user10);


//   - Проітерувати колекцію юзерів, вививши тільки юзерів з парним значенням ід
        for (int i = 0; i < user.size(); i++) {
            if (i % 2 == 1) {
                System.out.println(user.get(i));
            }
        }

//   - Проітерувати колекцію юзерів, вививши тільки юзерів з ім'ям , довжина якого більше ніж 5 символів
//        for (User i : user) {
//            if (i.getName().length() > 5) {
//                System.out.println(i);
//            }
//        }


//   - Проітерувати колекцію юзерів, вививши тільки юзерів жінок
//        for (User i : user) {
//            if (i.getGender().toString() == "Female") {
//                System.out.println(i);
//            }
//        }

    }
}
