package energy_glow;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@Component("myMusicPlayer")
public class MusicPlayer {
    private Music classicalMusic;
    private Music rockMusic;
    private String name;
    private int volume;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music classicalMusic, @Qualifier("rockMusic") Music rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public MusicPlayer(Music classicalMusic, Music rockMusic, String name, int volume) {
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
