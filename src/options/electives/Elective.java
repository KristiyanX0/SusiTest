package options.electives;

public record Elective(String name, int credits, Group group) {
    static final int MAXCREDITS = 10;
    public Elective {
        if (credits > MAXCREDITS) {
            throw new IllegalArgumentException("Invalid number of credits: " + credits + ". Maximum allowed is 10.");
        }
    }
}
