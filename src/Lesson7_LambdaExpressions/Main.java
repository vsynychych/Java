package Lesson7_LambdaExpressions;

//        Створити енум Стать.
//        Створити клас Юзер з плоями : ід, ім'я , вік, Стать.
//        Ствроити 10 об'єктів Юзера з відповідними ід (1-10)
//        Свторити  arrayList , та покласти цих юзерів в arayList.
//        - Проітерувати колекцію юзерів, вивевши тільки юзерів з парним значенням ід
//        - Проітерувати колекцію юзерів, вивевши тільки юзерів з ім'ям , довжина якого більше ніж 5 символів
//        - Проітерувати колекцію юзерів, вивевши тільки юзерів жінок


//        #Практическая
//        Создайте HashMap, содержащий пары значений  - имя игрушки и объект игрушки (класс Product, age, size).
//        Перебрать и распечатать пары значений - entrySet().
//        Перебрать и распечатать набор из имен продуктов  - keySet().
//        Перебрать и распечатать значения продуктов - values().
//        отфильтровать мапу по ключам которые начинаются с какой-то буквы
//        создать два листа с этой же мапы... один лист ключей другой лист значений
//        создать лист со значений мапы где size > 100
//        c мапы создать лист в который будут записаны только age
//        если у игрушки возраст больше 5, то размер поменять на 1000

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        User user1 = new User(1, "Oleg", 23, Gender.Male);
        User user2 = new User(2, "Nazar", 20, Gender.Male);
        User user3 = new User(3, "Taras", 43, Gender.Male);
        User user4 = new User(4, "Olena", 18, Gender.Female);
        User user5 = new User(5, "Alina", 29, Gender.Female);
        User user6 = new User(6, "Mykola", 39, Gender.Male);
        User user7 = new User(7, "Nastia", 25, Gender.Female);
        User user8 = new User(8, "Tetiana", 34, Gender.Female);
        User user9 = new User(9, "Viktor", 40, Gender.Male);
        User user10 = new User(10, "Igor", 27, Gender.Male);

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
        users.add(user7);
        users.add(user8);
        users.add(user9);
        users.add(user10);
        System.out.println(users);

        //        - Проітерувати колекцію юзерів, вивевши тільки юзерів з парним значенням ід
        List<User> collect = users.stream().filter(user -> user.getId() % 2 == 1).collect(Collectors.toList());
        System.out.println(collect);

        //        - Проітерувати колекцію юзерів, вивевши тільки юзерів з ім'ям , довжина якого більше ніж 5 символів
        Set<User> collect1 = users.stream().filter(user -> user.getName().length() > 5).collect(Collectors.toSet());
        System.out.println(collect1);

        //- Проітерувати колекцію юзерів, вивевши тільки юзерів жінок
        List<User> female = users.stream().filter(user -> user.getGender().equals(Gender.Female)).collect(Collectors.toList());
        System.out.println(female);


//***************************************************************************************************************************************


//        #Практическая
//        Создайте HashMap, содержащий пары значений  - имя игрушки и объект игрушки (класс Product, age, size).
        Map<String, Product> toy = new HashMap<>();
        toy.put("Barby", new Product(1, 80));
        toy.put("Soldier", new Product(8, 100));
        toy.put("Train", new Product(3, 555));
        toy.put("Robot", new Product(9, 99));
        toy.put("Bear", new Product(5, 220));

//        Перебрать и распечатать пары значений - entrySet().
        Set<Map.Entry<String, Product>> entries = toy.entrySet();
        System.out.println(entries);
//        entries.forEach(next -> {
//            Product value = next.getValue();
//            String key =  next.getKey();
//            System.out.println(value);
//            System.out.println(key);
//        });

//        Перебрать и распечатать набор из имен продуктов  - keySet().
        Set<String> keySet = toy.keySet();
        for (String next : keySet) {
            System.out.println(next);
        }

//        Перебрать и распечатать значения продуктов - values().
        Collection<Product> values = toy.values();
        for (Product next : values) {
            System.out.println(next);
        }

//        отфильтровать мапу по ключам которые начинаются с какой-то буквы
        List<String> listB = toy.keySet().stream().filter(toys -> toys.startsWith("B")).collect(Collectors.toList());
        System.out.println(listB);

//        создать два листа с этой же мапы... один лист ключей другой лист значений
        List<String> keyList = new ArrayList<>(toy.keySet());
        System.out.println(keyList);

        List<Product> productList = new ArrayList<>(toy.values());
        System.out.println(productList);

//        создать лист со значений мапы где size > 100
        List<Product> collect2 = toy.values().stream().filter(toys -> toys.getSize() > 100).collect(Collectors.toList());
        System.out.println(collect2);

//        c мапы создать лист в который будут записаны только age
        List<Integer> collect3 = toy.values().stream().map(Product::getAge).collect(Collectors.toList());
        System.out.println(collect3);

//        если у игрушки возраст больше 5, то размер поменять на 1000

        Collection<Product> values1 = toy.values();
        for (Product product : values1) {
            if (product.getAge() > 5) {
                product.setSize(1000);
            }
        }
        System.out.println(values1);


    }
}
