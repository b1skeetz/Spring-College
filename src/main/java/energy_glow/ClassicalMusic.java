package energy_glow;


public class ClassicalMusic implements Music{
    @Override
    public String getSong() {
        return "Moonlight Sonata";
    }

    @Override
    public String toString() {
        return getSong();
    }
}
