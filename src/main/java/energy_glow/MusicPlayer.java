package energy_glow;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Getter
@Setter
@ToString
//@Component("myMusicPlayer")
public class MusicPlayer {
    private List<Music> genres;
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    private final Random random = new Random();

    //@Autowired
    public MusicPlayer(@Qualifier("genres") List<Music> genres) {
        this.genres = genres;
    }

    public String playMusic() {
        return genres.get(random.nextInt(genres.size())).getSong();
    }
}
