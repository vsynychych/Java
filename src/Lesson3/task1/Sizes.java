package Lesson3.task1;

public enum Sizes {

    XXL(52), L(50), M(48), S(46);

    int euroSize;

    void getDescription() {
    }

    ;

    Sizes(int euroSize) {

        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public void setEuroSize(int euroSize) {
        this.euroSize = euroSize;
    }

    @Override
    public String toString() {
        return "Sizes " + super.toString() + " (" +
                "euroSize=" + euroSize +
                ")";
    }
}
