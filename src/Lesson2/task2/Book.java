package Lesson2.task2;

public class Book extends Papyrus{
    private String author;
    private String name;
    private String type;
    private int publishedIn;

    public Book() {
    }

    public Book(String purpose) {
        super(purpose);
    }

    public Book(String author, String name, String type, int publishedIn) {
        this.author = author;
        this.name = name;
        this.type = type;
        this.publishedIn = publishedIn;
    }

    public Book(String purpose, String author, String name, String type, int publishedIn) {
        super(purpose);
        this.author = author;
        this.name = name;
        this.type = type;
        this.publishedIn = publishedIn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPublishedIn() {
        return publishedIn;
    }

    public void setPublishedIn(int publishedIn) {
        this.publishedIn = publishedIn;
    }


    @Override
    public String toString() {
        return
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", publishedIn=" + publishedIn
                 + ", "+ super.toString();
    }
}
