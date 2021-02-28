package Lesson2.task2;

public class Journal extends Book{
    private String releaseFrequency;

    public Journal() {
    }

    public Journal(String purpose) {
        super(purpose);
    }

    public Journal(String purpose, String releaseFrequency) {
        super(purpose);
        this.releaseFrequency = releaseFrequency;
    }

    public Journal(String author, String name, String type, int publishedIn, String releaseFrequency) {
        super(author, name, type, publishedIn);
        this.releaseFrequency = releaseFrequency;
    }

    public Journal(String purpose, String author, String name, String type, int publishedIn, String releaseFrequency) {
        super(purpose, author, name, type, publishedIn);
        this.releaseFrequency = releaseFrequency;
    }

    public Journal(String author, String name, String type, int publishedIn) {
        super(author, name, type, publishedIn);
    }

    public Journal(String purpose, String author, String name, String type, int publishedIn) {
        super(purpose, author, name, type, publishedIn);
    }

    public String getReleaseFrequency() {
        return releaseFrequency;
    }

    public void setReleaseFrequency(String releaseFrequency) {
        this.releaseFrequency = releaseFrequency;
    }

    @Override
    public String toString() {
        return
                super.toString()+", releaseFrequency='" + releaseFrequency;
    }
}
