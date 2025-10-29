package library;

public class Admin {
    private int id;
    private String name;

    public Admin(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void rename(String newName) {
        if (newName != null && !newName.isEmpty()) {
            this.name = newName;
            System.out.println("Ім'я адміністратора змінено на: " + newName);
        } else {
            System.out.println("Некоректне ім'я!");
        }
    }

    public void addBook(Book book) {
        System.out.println("Адмін " + name + " додав книгу: " + book.getTitle());
    }

    public void removeBook(Book book) {
        System.out.println("Адмін " + name + " видалив книгу: " + book.getTitle());
    }

    public void blockUser(User user) {
        System.out.println("Користувач " + user.getName() + " заблокований адміністратором " + name);
    }

    void internalNotify(String message) {
        System.out.println("Системне сповіщення адміну: " + message);
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
