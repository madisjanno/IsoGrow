import points.Coord;

import java.util.Collections;
import java.util.Set;

public class Area<T extends Coord> {
    private final Set<T> area;

    Area(Set<T> area) {
        this.area = Collections.unmodifiableSet(area);
    }

    Set<T> getArea() {
        return area;
    }
}
