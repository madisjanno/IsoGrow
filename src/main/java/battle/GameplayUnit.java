package battle;

import overland.Unit;

public class GameplayUnit {
    private GameplayTile location;
    final Unit unit;

    public GameplayUnit(Unit unit) {
        this.unit = unit;
    }

    public GameplayTile getLocation() {
        return location;
    }

    public void setLocation(GameplayTile location) {
        this.location = location;
    }
}
