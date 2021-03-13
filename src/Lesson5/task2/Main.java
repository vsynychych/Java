package Lesson5.task2;

//Даний проект має такі сутності: Days, Time, Movie, Seance, Schedule, Cinema.
//        enum Days:
//        - прописати дні тижня;
//        Time:
//        - int min, int hour;
//        - передбачити межі для цих полів (для min 0..59, для hour 0..23);
//        Movie:
//        - String title, Time duration (або ж можете забити на власний Time і використати java.time.Duration,
//        як і тут, так і в інших класах. це за власним бажанням)
//        Seance:
//        - Movie movie, Time startTime, Time endTime;
//        - в конструктор має надходити параметрами значення для перших двох полів, третє поле повинне обчислюватись (start + duration);
//        Schedule:
//        - TreeSet <Seance> (в полі пишемо Set <Seance>, а в конструкторі вже =new TreeSet <Seance>() );
//   -     - Сортування по startTime.
//        - методи: addSeance (Seance), removeSeance (Seance);
//        Cinema:
//       - TreeMap<Days, Schedule>, Time open, Time close;
//   -     - врахувати час відкриття і закриття при формуванні сеансів!
//    -    - методи: addSeances (String day, Seance...seance) (додає набір сеансів в конкретний день), addSeance (Seance, String)
//   -     (додає один сеанс в конкретний день), removeMovie(Movie) (повністю видаляє усі сеанси вказаного фільму з розкладу),
//    -    removeSeance (Seance, String) (видаляє конкретний сеанс фільму в конкретний день, який задається параметром String).
//
//    -    Main class:
//    -    - створення об'єкту Cinema;
//    -    - викликаємо всі методи Cinema
//
//    -    Для кожного класу зробити адекватний toString, щоб все було читабельно і доступно.
//        Там де потрібно, зробити compareTo(). Маєте якісь власні ідеї для розробки - будь-ласка.
//        Це моделювання роботи кінотеатру, тому все що наблизить програму до реальності вітається.

import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Movie inception = new Movie("Inception", new Time(2, 28));
        Movie titanic = new Movie("Titanik", new Time(3, 14));
        Movie fightClub = new Movie("Fight Club", new Time(2, 19));
        Movie matrix = new Movie("The matrix", new Time(2, 13));
        Movie alien = new Movie("Alien", new Time(1, 56));
        Movie greenMile = new Movie("The green mile", new Time(2, 45));
        Movie terminator = new Movie("Terminator", new Time(2, 10));

        Seance movieInception = new Seance(inception, new Time(8, 0));
        Seance movieTitanic = new Seance(titanic, new Time(12, 20));
        Seance movieFightClub = new Seance(fightClub, new Time(13, 45));
        Seance movieMatrix = new Seance(matrix, new Time(16, 30));
        Seance movieAlien = new Seance(alien, new Time(19, 0));
        Seance movieGreenMile = new Seance(greenMile, new Time(15, 15));
        Seance movieTerminator = new Seance(terminator, new Time(16, 50));
        Seance movieInterstellar = new Seance(new Movie("Interstellar", new Time(2, 29)), new Time(14, 50));

        Seance test1 = new Seance(new Movie("TEST1", new Time(1, 0)), new Time(10, 45));
        Seance test2 = new Seance(new Movie("TEST2", new Time(1, 0)), new Time(12, 0));

        TreeSet<Seance> seancesAddit = new TreeSet<>();
        seancesAddit.add(test1);
        seancesAddit.add(test2);

        TreeSet<Seance> seanceSetMonday = new TreeSet<>();
        seanceSetMonday.add(movieInception);
        seanceSetMonday.add(movieTitanic);
        seanceSetMonday.add(movieFightClub);

        TreeSet<Seance> seanceSetTuesday = new TreeSet<>();
        seanceSetTuesday.add(movieMatrix);
        seanceSetTuesday.add(movieAlien);

        TreeSet<Seance> seanceSetWednesday = new TreeSet<>();
        seanceSetWednesday.add(movieGreenMile);
        seanceSetWednesday.add(movieInterstellar);

        TreeSet<Seance> seanceSetThursday = new TreeSet<>();
        seanceSetThursday.add(movieTerminator);

        TreeSet<Seance> seanceSetFriday = new TreeSet<>();
        seanceSetFriday.add(movieGreenMile);
        seanceSetFriday.add(movieFightClub);

        TreeSet<Seance> seanceSetSaturday = new TreeSet<>();
        seanceSetSaturday.add(movieInception);
        seanceSetSaturday.add(movieInterstellar);

        TreeSet<Seance> seanceSetSunday = new TreeSet<>();
        seanceSetSunday.add(movieTitanic);
        seanceSetSunday.add(movieFightClub);
        seanceSetSunday.add(movieMatrix);

        Schedule scheduleMonday = new Schedule(seanceSetMonday);
        Schedule scheduleTuesday = new Schedule(seanceSetTuesday);
        Schedule scheduleWednesday = new Schedule(seanceSetWednesday);
        Schedule scheduleThursday = new Schedule(seanceSetThursday);
        Schedule scheduleFriday = new Schedule(seanceSetFriday);
        Schedule scheduleSaturday = new Schedule(seanceSetSaturday);
        Schedule scheduleSunday = new Schedule(seanceSetSunday);

        scheduleMonday.removeSeance(movieInception);
        scheduleThursday.addSeance(movieInception);

        TreeMap<Days, Schedule> cinemas = new TreeMap<>();
        cinemas.put(Days.Monday, scheduleMonday);
        cinemas.put(Days.Tuesday, scheduleTuesday);
        cinemas.put(Days.Wednesday, scheduleWednesday);
        cinemas.put(Days.Thursday, scheduleThursday);
        cinemas.put(Days.Friday, scheduleFriday);
        cinemas.put(Days.Saturday, scheduleSaturday);
        cinemas.put(Days.Sunday, scheduleSunday);

        Cinema cinema = new Cinema(cinemas,
                new Time(10, 0),
                new Time(23, 0));
        System.out.println(cinema);

        cinema.addSeance(test1, Days.Monday);
        cinema.addSeances(Days.Sunday, seancesAddit);
        cinema.removeMovie(inception);
        cinema.removeSeance(Days.Friday, movieFightClub);
        System.out.println(cinema);
    }
}
