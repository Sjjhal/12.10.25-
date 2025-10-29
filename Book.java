package library;

public class Book {
    private int id;
    private String title;
    private String author;
    private int year;
    private String genre;
    private String type;

    public Book(int id, String title, String author, int year, String genre, String type) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public String getType() {
        return type;
    }

    public void open() {
        System.out.println("Книга \"" + title + "\" відкрита.");
    }

    public void read() {
        System.out.println("Читання книги \"" + title + "\" автора " + author + ".");
    }

    public void updateGenre(String newGenre) {
        this.genre = newGenre;
        System.out.println("Жанр книги \"" + title + "\" змінено на " + newGenre + ".");
    }

    void internalBookInfo() {
        System.out.println("Внутрішня інформація: ID " + id + ", рік " + year);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", genre='" + genre + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
