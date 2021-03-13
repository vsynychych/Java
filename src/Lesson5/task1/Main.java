package Lesson5.task1;

//Створити клас Зооклуб. В цьому класі створити одне поле: private Map <Person, List <Pet>> club;
//        В мейн методі створити меню, яке буде реалізовувати наступні функції:
//        1) додати учасника в клуб;
//        2) додати тваринку до учасника клубу.
//        3) видалити тваринку з власника.
//        4) видалити учасника клубу.
//        5) видалити конкретну тваринку з усіх власників.
//        6) вивести на екран зооклуб.

import java.util.*;

public class Main {

    public static void main(String[] args) {

//        1) додати учасника в клуб;
        Map<Person, List<Pet>> club = new HashMap<>();

        List<Pet> petList1 = new ArrayList<>();
        List<Pet> petList2 = new ArrayList<>();
        List<Pet> petList3 = new ArrayList<>();
        List<Pet> petList4 = new ArrayList<>();

        club.put(new Person(1, "Maks"), petList1);
        club.put(new Person(2, "Alex"), petList2);
        club.put(new Person(3, "Ania"), petList3);
        club.put(new Person(4, "Katia"), petList4);


//       2) додати тваринку до учасника клубу.
        petList1.add(new Pet("dog", "Bobko"));
        petList1.add(new Pet("cat", "Amigo"));
        petList1.add(new Pet("turtle", "Harold"));
        petList1.add(new Pet("parrot", "Zik"));

        petList2.add(new Pet("dog", "Bart"));
        petList2.add(new Pet("cat", "Ice"));

        petList3.add(new Pet("cat", "Andre"));
        petList3.add(new Pet("cat", "Isaac"));
        petList3.add(new Pet("fish", "gold"));

        petList4.add(new Pet("dog", "Bond"));


//     3) видалити тваринку з власника.
        club.get(new Person(1, "Maks")).remove(new Pet("dog", "Bobko"));
        System.out.println(club.get(new Person(1, "Maks")));


//     4) видалити учасника клубу.
        club.remove(new Person(1, "Maks"));
        System.out.println(club);


//       5) видалити конкретну тваринку з усіх власників.
//        Set<Map.Entry<Person, List<Pet>>> entries = club.entrySet();
//        Iterator<Map.Entry<Person, List<Pet>>> iterator = entries.iterator();
//        while (iterator.hasNext()) {
//            Map.Entry<Person, List<Pet>> next = iterator.next();
//            if (next.getValue().removeIf(pet -> pet.getBreed().equals("dog"))) ;
//        }


//        Set<Map.Entry<Person, List<Pet>>> entries = club.entrySet();
//        for (Map.Entry<Person, List<Pet>> next : entries) {
//            next.getValue().removeIf(pet -> pet.getBreed().equals("dog"));
//        }
//        System.out.println(club);

//       6) вивести на екран зооклуб
        ZooClub zooClub = new ZooClub(club);
        System.out.println(zooClub);


//************************************************************************************************************************
        Map<Person, List<Pet>> club2 = new HashMap<>();

        System.out.println("Command Options: ");
        System.out.println("1: додати учасника в клуб");
        System.out.println("2: додати тваринку до учасника клубу");
        System.out.println("3: видалити тваринку з власника");
        System.out.println("4: видалити учасника клубу");
        System.out.println("5: вивести на екран зооклуб");
        System.out.println("?: Display");
        System.out.println("q: Quit");

        Scanner scan = new Scanner(System.in);
        String choice;
        do {
            choice = scan.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("Введіть id нового учасника клубу: ");
                    int id = scan.nextInt();
                    System.out.println("Введіть ім'я нового учасника клубу: ");
                    String name = scan.next();
                    club2.put(new Person(id, name), null);
                    System.out.println("Учвсник " + id + " " + name + " успішно доданий до клубу");
                    break;

                case "2":
                    String nameFromList;
                    boolean nameFromList2 = false;
                    System.out.println(club2);
                    System.out.println("Введіть ім'я учасника клубу, котрому потрібно додати тваринку: ");

                    do {
                        nameFromList = scan.next();

                        Set<Map.Entry<Person, List<Pet>>> entries = club2.entrySet();
                        for (Map.Entry<Person, List<Pet>> next : entries) {
                            if (next.getKey().getName().equals(nameFromList)) {
                                nameFromList2 = true;
                                break;
                            } else {
                                System.out.println("Учасника із таким ім'ям не існує...");
                                nameFromList2 = false;
                            }
                        }
                    } while (!nameFromList2);


                    System.out.println("Введіть вид домашньої тварини: ");
                    String breed = scan.next();

                    System.out.println("Введіть ім'я тварини: ");
                    String namePet = scan.next();

                    Person person = new Person(0, nameFromList);
                    Pet pet = new Pet(breed, namePet);
                    List<Pet> pets = new ArrayList<>();
                    pets.add(pet);

                    club2.put(person, pets);
                    System.out.println("Ви успішно додали тваринку " + namePet + " до учасника " + nameFromList);
                    break;

                case "3":
                    System.out.println(club2);
                    String removePet;
                    boolean removePet2 = false;
                    System.out.println("Введіть ім'я учасника клубу, котрому потрібно видалити тваринку: ");

                    do {
                        removePet = scan.next();
                        Set<Map.Entry<Person, List<Pet>>> entries = club2.entrySet();
                        for (Map.Entry<Person, List<Pet>> next : entries) {
                            if (next.getKey().getName().equals(removePet)) {
                                next.getValue().clear();
                                removePet2 = true;
                                break;
                            } else {
                                System.out.println("Учасника із таким ім'ям не існує...");
                                removePet2 = false;
                                break;
                            }
                        }
                    } while (!removePet2);
                    System.out.println("Тварина була успішно видалена!");
                    System.out.println(club2);
                    break;

                case "4":
                    System.out.println(club2);
                    String removePerson;
                    boolean removePerson2 = false;
                    System.out.println("Введіть ім'я учасника клубу, котрого потрібно видалити: ");

                    do {
                        removePerson = scan.nextLine();
                        Set<Map.Entry<Person, List<Pet>>> entries = club2.entrySet();
                        Iterator<Map.Entry<Person, List<Pet>>> iterator = entries.iterator();
                        while (iterator.hasNext()) {
                            Map.Entry<Person, List<Pet>> next = iterator.next();
                            if (next.getKey().getName().equals(removePerson)) {
                                iterator.remove();
                                removePerson2 = true;
                                break;
                            } else {
                                System.out.println("Учасника із таким ім'ям не існує...");
                                removePerson2 = false;

                            }
                        }
                    } while (!removePerson2);

                    System.out.println("Учасник був успішно видалений!");
                    System.out.println(club2);
                    break;

                case "5":
                    ZooClub zooClub2 = new ZooClub(club2);
                    System.out.println(zooClub2);

                    break;

                case "?":
                    System.out.println("Command Options: ");
                    System.out.println("1: додати учасника в клуб");
                    System.out.println("2: додати тваринку до учасника клубу");
                    System.out.println("3: видалити тваринку з власника");
                    System.out.println("4: видалити учасника клубу");
                    System.out.println("5: видалити конкретну тваринку з усіх власників");
                    System.out.println("6: вивести на екран зооклуб");
                    System.out.println("?: Display");
                    System.out.println("q: Quit");
                    break;
                default:
            }
        } while (!choice.equals("q"));
    }
}
