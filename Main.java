package library;

public class Main {
    public static void main(String[] args) {
        User user = new User(1, "Іван", "Петренко", "ivan123", "12345", "користувач");
        Admin admin = new Admin(1, "Олена");
        Book book = new Book(1, "Кобзар", "Тарас Шевченко", 1840, "Поезія", "електронна книга");
        Category category = new Category(1, "Класична література");
        LibraryCatalog catalog = new LibraryCatalog("Центральний каталог");
        Download download = new Download(1, user, book, "2025-10-03");

        System.out.println(user);
        System.out.println(admin);
        System.out.println(book);
        System.out.println(category);
        System.out.println(catalog);
        System.out.println(download);

        user.register();
        user.login();
        user.addToFavorites(book);

        admin.addBook(book);
        admin.removeBook(book);
        admin.blockUser(user);

        category.addBook(book);
        category.removeBook(book);

        catalog.searchByTitle("Кобзар");
        catalog.searchByAuthor("Тарас Шевченко");

        download.startDownload();

        user.changePassword("12345", "newpass123");
        admin.rename("Марія");
        category.rename("Українська класика");
        catalog.rename("Головний каталог");
        book.updateGenre("Лірика");
    }
}
