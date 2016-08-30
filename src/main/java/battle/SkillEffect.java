package battle;

public interface SkillEffect {
    void apply(GameplayUnit user, GameplayTile target, BattleBoard board);
}
