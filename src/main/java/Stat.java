
public class Stat {
    private String name;

    private int base;
    private int bonuses;

    int getValue() {
        return base + bonuses;
    }

    String getName() {
        return name;
    }
}
