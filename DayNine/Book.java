package DayNine;

public class Book {
    private String title;
    private String author;
    private String date;

    public Book(String title, String author, String date) {
        this.author = author;
        this.title = title;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getDate() {
        return date;
    }

    public void setTitle(String newTitle) {
        title = newTitle;
    }

    public void setAuthor(String newAuthor) {
        title = newAuthor;
    }

    public void setDate(String newDate) {
        title = newDate;
    }

    public void bookInfo() {
        System.out.println("Title: " + title + "\t Author: " + author + "\t Date: " + date);
    }

}
