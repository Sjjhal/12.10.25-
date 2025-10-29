package library;

public class Download {
    private int id;
    private User user;
    private Book book;
    private String date;

    public Download(int id, User user, Book book, String date) {
        this.id = id;
        this.user = user;
        this.book = book;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public Book getBook() {
        return book;
    }

    public String getDate() {
        return date;
    }

    public void startDownload() {
        System.out.println("Користувач " + user.getName() + " завантажує книгу \"" + book.getTitle() + "\" (" + date + ")");
    }

    void internalDownloadInfo() {
        System.out.println("Внутрішня інформація: ID " + id + ", користувач " + user.getName());
    }

    @Override
    public String toString() {
        return "Download{" +
                "id=" + id +
                ", user=" + user +
                ", book=" + book +
                ", date='" + date + '\'' +
                '}';
    }
}
