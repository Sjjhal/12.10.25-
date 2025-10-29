package library;

public class LibraryCatalog {
    private String name;

    public LibraryCatalog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void rename(String newName) {
        if (newName != null && !newName.isEmpty()) {
            this.name = newName;
            System.out.println("Каталог перейменовано на: " + newName);
        } else {
            System.out.println("Некоректна назва каталогу!");
        }
    }

    public void searchByTitle(String title) {
        System.out.println("Пошук книги за назвою: " + title);
    }

    public void searchByAuthor(String author) {
        System.out.println("Пошук книги за автором: " + author);
    }

    void internalCatalogInfo() {
        System.out.println("Внутрішня інформація про каталог: " + name);
    }

    @Override
    public String toString() {
        return "LibraryCatalog{" +
                "name='" + name + '\'' +
                '}';
    }
}
