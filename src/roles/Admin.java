package roles;

public class Admin implements User {

    String name;

    public Admin(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Role getRole() {
        return Role.ADMIN;
    }
}
