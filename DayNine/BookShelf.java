package DayNine;

public class BookShelf {
    public static void main(String[] args) {
        Book book1 = new Book("Romeo and Juliet","William Shakespear", "23/03/19");
        book1.bookInfo();
        book1.setAuthor("Prudent Kurler");
        book1.bookInfo();
    }
}
