package points;

public class CoordWithLimit extends Coord {
    public final int upperLimit;
    public final int lowerLimit;

    public CoordWithLimit(int x, int y, int upperLimit, int lowerLimit) {
        super(x, y);
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
    }

    boolean matches(CoordWithHeight other) {
        return other.x == x && other.y == y && other.z >= lowerLimit && other.z <= upperLimit;
    }
}
