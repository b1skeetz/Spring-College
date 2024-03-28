package energy_glow;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("rockMusic")
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
