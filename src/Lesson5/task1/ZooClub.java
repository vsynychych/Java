package Lesson5.task1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ZooClub {

    private Map <Person,List<Pet>> club;

    public ZooClub() {
    }

    public ZooClub(Map<Person, List<Pet>> club) {
        this.club = club;
    }

    public Map<Person, List<Pet>> getClub() {
        return club;
    }

    public void setClub(Map<Person, List<Pet>> club) {
        this.club = club;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ZooClub zooClub = (ZooClub) o;
        return Objects.equals(club, zooClub.club);
    }

    @Override
    public int hashCode() {
        return Objects.hash(club);
    }

    @Override
    public String toString() {
        return "ZooClub " +
                 club;
    }
}
