package options.electives;

import exceptions.NotAdminRights;
import roles.Role;
import roles.Student;
import roles.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Enroll {
    // Elective -> enrolled students
    private static HashMap<Elective, List<Student>> electives = new HashMap<>();

    public static void addElective(User user, Elective elective) throws NotAdminRights {
        if (user.getRole().equals(Role.ADMIN)) {
            electives.putIfAbsent(elective, new ArrayList<>());
        }
        else {
            throw new NotAdminRights();
        }
    }

    public static void enroll(Student student)
    {

    }
}
