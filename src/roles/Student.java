package roles;

public class Student implements User {

    String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public Role getRole() {
        return Role.STUDENT;
    }
}
