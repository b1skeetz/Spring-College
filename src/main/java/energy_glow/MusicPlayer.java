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
    private Music popMusic;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music classicalMusic, @Qualifier("rockMusic") Music rockMusic, @Qualifier("popMusic") Music popMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.popMusic = popMusic;
    }

    public String playMusic(Genre type) {
        switch(type){
            case CLASSICAL: return classicalMusic.getSong();
            case ROCK: return rockMusic.getSong();
            case POP: return popMusic.getSong();
            default: return "This genre doesn't exist!";
        }
    }
}
