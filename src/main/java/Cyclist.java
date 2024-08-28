public class Cyclist {

    private String name;
    private String team;

    public String getName() {
        return name;
    }
    public String getTeam() {
        return team;
    }

    public Cyclist (String name, String team) {
        this.name = name;
        this.team = team;
    }

    @Override
    public String toString() {
        return "Name: " + name + " | Team: " + team;
    }
}
