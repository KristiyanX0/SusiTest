package options.electives;

import options.electives.exceptions.ElectiveNonExisting;
import options.electives.exceptions.NotAdminRights;
import roles.Role;
import roles.Student;
import roles.User;
import tools.Pair;

import javax.naming.NameNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Enroll {
    final static int MAX_SIZE_ELECTIVE = 30;
    // Elective -> enrolled students
    private static HashMap<String, Pair<Elective, List<String>>> electives = new HashMap<>();

    public static void addElective(User user, Elective elective) throws NotAdminRights {
        if (user.getRole().equals(Role.ADMIN)) {
            electives.putIfAbsent(elective.name(), new Pair<>(elective, new ArrayList<String>()));
        }
        else {
            throw new NotAdminRights();
        }
    }

    public static void enroll(User user, String name) throws NameNotFoundException, ElectiveNonExisting {
        if (electives.containsKey(name)) {
            if (user.getRole().equals(Role.STUDENT)) {
                if (electives.get(name).getValue().size() >= MAX_SIZE_ELECTIVE) {
                    electives.get(name).getValue().add(user.getName());
                }
            }
        }
        else {
            throw new ElectiveNonExisting();
        }
    }
}
