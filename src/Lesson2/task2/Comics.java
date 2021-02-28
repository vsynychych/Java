package Lesson2.task2;

public class Comics extends Book{
    private String country;

    public Comics() {
    }

    public Comics(String purpose) {
        super(purpose);
    }

    public Comics(String purpose, String country) {
        super(purpose);
        this.country = country;
    }

    public Comics(String author, String name, String type, int publishedIn, String country) {
        super(author, name, type, publishedIn);
        this.country = country;
    }

    public Comics(String purpose, String author, String name, String type, int publishedIn, String country) {
        super(purpose, author, name, type, publishedIn);
        this.country = country;
    }

    public Comics(String author, String name, String type, int publishedIn) {
        super(author, name, type, publishedIn);
    }

    public Comics(String purpose, String author, String name, String type, int publishedIn) {
        super(purpose, author, name, type, publishedIn);
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return
                super.toString() +", country='" + country;
    }
}
