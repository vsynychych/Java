package Lesson2.task2;

public class Papyrus {
    private String purpose;

    public Papyrus() {
    }

    public Papyrus(String purpose) {
        this.purpose = purpose;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @Override
    public String toString() {
        return "purpose='" + purpose;
    }
}

