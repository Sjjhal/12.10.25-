package library;

public class Category {
    private int id;
    private String name;

    public Category(int id, String name) {
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
            System.out.println("Категорію перейменовано на: " + newName);
        } else {
            System.out.println("Некоректна назва категорії!");
        }
    }

    public void addBook(Book book) {
        System.out.println("Книга \"" + book.getTitle() + "\" додана до категорії \"" + name + "\".");
    }

    public void removeBook(Book book) {
        System.out.println("Книга \"" + book.getTitle() + "\" видалена з категорії \"" + name + "\".");
    }

    void internalCategoryInfo() {
        System.out.println("Внутрішня інформація про категорію: ID " + id);
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
