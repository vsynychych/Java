package Lesson5.task2;

//  - TreeSet <Seance> (в полі пишемо Set <Seance>, а в конструкторі вже =new TreeSet <Seance>() );
//  - Сортування по startTime.
//  - методи: addSeance (Seance), removeSeance (Seance);

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Schedule {
    private Set<Seance> seanceSet;

    public Schedule() {
    }

    public Schedule(TreeSet<Seance> seanceSet) {
        this.seanceSet = seanceSet;
    }

    public Schedule(Set<Seance> treeSet) {
        this.seanceSet = new TreeSet<Seance>(seanceSet);
    }

    public Set<Seance> getSeanceSet() {
        return seanceSet;
    }

    public void setSeanceSet(Set<Seance> seanceSet) {
        this.seanceSet = seanceSet;
    }

    public void addSeance(Seance seance) {
        seanceSet.add(seance);
    }

    public void removeSeance(Seance seance) {
        seanceSet.remove(seance);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Schedule schedule = (Schedule) o;
        return Objects.equals(seanceSet, schedule.seanceSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(seanceSet);
    }

    @Override
    public String toString() {
        return seanceSet + "";
    }
}
