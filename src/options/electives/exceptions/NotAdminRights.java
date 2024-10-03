package options.electives.exceptions;

public class NotAdminRights extends Exception {
    public NotAdminRights() {
        super("You do not have admin rights to perform this action.");
    }

    public NotAdminRights(String message) {
        super(message);
    }
}