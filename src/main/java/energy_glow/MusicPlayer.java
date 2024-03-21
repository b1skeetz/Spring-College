package energy_glow;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;

    public MusicPlayer() {
    }

    // IoC инверсия управления

    public MusicPlayer(List<Music> musicList, String name, int volume) {
        this.musicList = musicList;
        this.name = name;
        this.volume = volume;
    }

    public void playMusic() {
        StringBuilder songs = new StringBuilder();
        for (Music music : musicList) {
            songs.append(music).append(" ");
        }
        System.out.println("Playing: " + songs);
    }
}
