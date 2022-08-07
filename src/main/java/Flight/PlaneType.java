package Flight;

public enum PlaneType {

    Concorde("Concorde"),
    Jumbo("Jumbo"),
    airbus("airbus");

        private final String plane;

    PlaneType(String plane) {
        this.plane = plane;
    }
}
