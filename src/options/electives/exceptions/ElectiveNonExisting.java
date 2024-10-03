package options.electives.exceptions;

public class ElectiveNonExisting extends Exception {
    public ElectiveNonExisting() {
        super("Non existing elective.");
    }

    public ElectiveNonExisting(String message) {
        super(message);
    }
}