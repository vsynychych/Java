package Lesson5.task2;

public enum Days {
    Monday ("Monday"),
    Tuesday ("Tuesday"),
    Wednesday ("Wednesday"),
    Thursday ("Thursday"),
    Friday ("Friday"),
    Saturday ("Saturday"),
    Sunday ("Sunday");

    String day;


    Days(String day) {
        this.day = day;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "\n"+day+"";
    }
}
