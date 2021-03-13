package Lesson5.task2;

import java.util.*;

public class Cinema {
    private TreeMap<Days, Schedule> cinema;
    private Time open;
    private Time close;

    public Cinema() {
    }

    public Cinema(TreeMap<Days, Schedule> cinema, Time open, Time close) {
        this.cinema = cinema;
        this.open = open;
        this.close = close;
    }

    public TreeMap<Days, Schedule> getCinema() {
        return cinema;
    }

    public void setCinema(TreeMap<Days, Schedule> cinema) {
        this.cinema = cinema;
    }

    public Time getOpen() {
        return open;
    }

    public void setOpen(Time open) {
        this.open = open;
    }

    public Time getClose() {
        return close;
    }

    public void setClose(Time close) {
        this.close = close;
    }


    public void addSeance(Seance seance, Days day) {
        Set<Map.Entry<Days, Schedule>> entries = cinema.entrySet();
        for (Map.Entry<Days, Schedule> next : entries) {
            if (next.getKey().equals(day)) {
                next.getValue().addSeance(seance);
            }
        }
    }

    public void addSeances(Days day, TreeSet<Seance> seance) {
        cinema.put(Days.valueOf(day.getDay()), new Schedule(seance));
    }

    public void removeMovie(Movie movie) {
        Set<Map.Entry<Days, Schedule>> entries = cinema.entrySet();
        Iterator<Map.Entry<Days, Schedule>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Days, Schedule> next = iterator.next();
            if (iterator.hasNext()) {
                next.getValue().getSeanceSet().removeIf(seance -> seance.movie.equals(movie));
            }
        }
        System.out.println(movie + " був успішно видалений");
    }

    public void removeSeance(Days days, Seance seance) {
        Set<Map.Entry<Days, Schedule>> entries = cinema.entrySet();
        for (Map.Entry<Days, Schedule> next : entries) {
            if (next.getKey().equals(days)) {
                next.getValue().removeSeance(seance);
                System.out.println("Сеанс " + seance + " був успішно видалений у " + days);
            } else {
                System.out.println("Перевірте назву сеансу!!!");
            }
        }
    }

//    public void removeSeance(Days days, Seance seance) {
//        Set<Map.Entry<Days, Schedule>> entries = cinema.entrySet();
//        Iterator<Map.Entry<Days, Schedule>> iterator = entries.iterator();
//        while (iterator.hasNext()) {
//            Map.Entry<Days, Schedule> next = iterator.next();
//            if (next.getKey().equals(days)) {
//                next.getValue().removeSeance(seance);
//                System.out.println("Сеанс " + seance + " був успішно видалений у " + days);
//            } else {
//                System.out.println("Перевірте назву сеансу!!!");
//            }
//        }
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cinema cinema1 = (Cinema) o;
        return Objects.equals(cinema, cinema1.cinema) && Objects.equals(open, cinema1.open) && Objects.equals(close, cinema1.close);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cinema, open, close);
    }


    @Override
    public String toString() {
        return
                cinema + "\n" +
                        " open " + open +
                        ", close " + close;
    }
}
