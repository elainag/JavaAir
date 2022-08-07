package Person;

public enum Rank {

    Captain("Captain"),
    FirstOfficer("FirstOfficer"),
    Purser("FirstOfficer"),
    FlightAttendant("FlightAttendant");

    private final String rank;

    Rank(String rank){
        this.rank = rank;
    }
    public String getRank() {
        return rank;
    }
}
