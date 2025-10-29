package library;

public class User {
    private int id;
    private String firstName;
    private String lastName;
    private String login;
    private String password;
    private String role;

    public User(int id, String firstName, String lastName, String login, String password, String role) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.password = password;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public String getLogin() {
        return login;
    }

    public String getRole() {
        return role;
    }

    public void register() {
        System.out.println("Користувач " + getName() + " зареєстрований під логіном: " + login);
    }

    public void login() {
        System.out.println("Користувач " + getName() + " увійшов у систему.");
    }

    public void addToFavorites(Book book) {
        System.out.println("Книга \"" + book.getTitle() + "\" додана до улюблених користувача " + getName());
    }

    public void changePassword(String oldPassword, String newPassword) {
        if (this.password.equals(oldPassword) && newPassword != null && !newPassword.isEmpty()) {
            this.password = newPassword;
            System.out.println("Пароль користувача " + getName() + " змінено.");
        } else {
            System.out.println("Помилка зміни пароля!");
        }
    }

    void internalUserInfo() {
        System.out.println("Внутрішня інформація користувача: ID " + id + ", роль " + role);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", login='" + login + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
