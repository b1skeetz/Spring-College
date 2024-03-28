package energy_glow;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
@Qualifier("classicalMusic")
public class ClassicalMusic implements Music{
    private final List<String> songs = new ArrayList<>(Arrays.asList("Moonlight Sonata", "Turkish March",
            "Dance of the Knights"));
    private final Random random = new Random();

    @Override
    public String getSong() {
        return songs.get(random.nextInt(songs.size()));
    }

    @Override
    public String toString() {
        return getSong();
    }
}
