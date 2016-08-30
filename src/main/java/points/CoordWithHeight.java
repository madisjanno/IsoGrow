package points;

public class CoordWithHeight extends Coord {
    public final int z;

    public CoordWithHeight(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
}
