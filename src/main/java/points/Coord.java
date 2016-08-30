package points;

public class Coord {
    public final int x;
    public final int y;

    public Coord(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Coord) ) return false;

        Coord coordinate = (Coord) o;

        if (x != coordinate.x) return false;
        return y == coordinate.y;

    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }
}
