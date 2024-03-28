package energy_glow;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("popMusic")
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
