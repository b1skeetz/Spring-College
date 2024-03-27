package energy_glow;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@Component("myMusicPlayer")
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    private String name;
    private int volume;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic, String name, int volume) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.name = name;
        this.volume = volume;
    }

    public String playMusic() {
        return "{Playing: " + classicalMusic +
                "\nPlaying: " + rockMusic + "}";
    }
}
