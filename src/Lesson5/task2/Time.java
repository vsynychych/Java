package Lesson5.task2;

import java.util.Objects;

public class Time {
    int hour;
    int min;

    public Time() {
    }

    public Time(int hour, int min) {
        if (hour>0 & hour < 24) this.hour = hour;
        if (min>0 & min < 60) this.min = min;

    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Time time = (Time) o;
        return min == time.min && hour == time.hour;
    }

    @Override
    public int hashCode() {
        return Objects.hash(min, hour);
    }

    @Override
    public String toString() {
        return "time "+hour+":" +min;
    }
}
