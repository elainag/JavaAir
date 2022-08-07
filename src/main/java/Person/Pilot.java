package Person;

public class Pilot extends Person {

    private String licenseNumber;
    private Rank rank;

    public Pilot(String name, String licenseNumber, Rank rank) {
        super(name);
        this.licenseNumber = licenseNumber;
        this.rank = rank;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }
    public Rank getRank(){
        return rank;
    }




}
