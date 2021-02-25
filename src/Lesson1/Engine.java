package Lesson1;

public class Engine {
    private int volume;
    private int power;

    public Engine() {
    }

    public Engine(int volume, int power) {
        this.volume = volume;
        this.power = power;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return this.power;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "volume=" + volume +
                ", power=" + power +
                '}';
    }
}


