package Lesson5.task2;

import java.util.Objects;

// - Movie movie, Time startTime, Time endTime;
// - в конструктор має надходити параметрами значення для перших двох полів, третє поле повинне обчислюватись (start + duration);
public class Seance implements Comparable<Seance> {

    Movie movie;
    Time startTime;
    Time endTime;

    public Seance() {
    }

    public Seance(Movie movie, Time startTime) {
        this.movie = movie;
        this.startTime = startTime;
        int hours = startTime.getHour() + getMovie().getDuration().getHour();
        int min = startTime.getMin() + getMovie().getDuration().getMin();
        if (min > 60) {
            hours += 1;
            min = min - 60;
        }
        if (hours > 24) {
            hours = hours - 24;
        }
        this.endTime = new Time(hours, min);
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seance seance = (Seance) o;
        return Objects.equals(movie, seance.movie) && Objects.equals(startTime, seance.startTime) && Objects.equals(endTime, seance.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movie, startTime, endTime);
    }

    @Override
    public int compareTo(Seance o) {
        return this.getStartTime().getHour() - o.getStartTime().getHour();
    }

    @Override
    public String toString() {
        return

                movie +
                        ", start " + startTime +
                        ", end " + endTime;
    }
}
