package energy_glow;

import org.springframework.stereotype.Component;

@Component
public class PopMusic implements Music{
    @Override
    public String getSong() {
        return "Hurricane";
    }
    @Override
    public String toString() {
        return getSong();
    }
}
