package energy_glow;

public class RockMusic implements Music{

    @Override
    public String getSong() {
        return "It's not me, it's you";
    }
    @Override
    public String toString() {
        return getSong();
    }
}
