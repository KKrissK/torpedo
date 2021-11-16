package nye.progtech.torpedo.model;

public enum ShipClass {
    PATROLBOAT(1),
    SUBMARINE(2),
    DESTROYER(3),
    BATTLESHIP(4),
    CARRIER(5);

    public final Integer label;

    ShipClass(Integer label) {
        this.label = label;
    }
}
