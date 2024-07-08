package ImotTestsLogic;

public class UserBuilder {

    private String name;
    private String email;
    private String password;

    public UserBuilder name(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder email(String email) {
        this.email = email;
        return this;
    }

    public UserBuilder password(String password) {
        this.password = password;
        return this;
    }

    public User build() {
        return new User(name, email, password);
    }

}
