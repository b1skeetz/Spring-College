package energy_glow;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MusicPlayer {
    private Music music;
    private String name;
    private int volume;

    public MusicPlayer() {
    }

    // IoC инверсия управления
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
