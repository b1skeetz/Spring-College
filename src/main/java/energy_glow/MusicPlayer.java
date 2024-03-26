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
    //private List<Music> musicList = new ArrayList<>();
    private Music music;
    private String name;
    private int volume;

    private void OnInitialize(){
        System.out.println("Music Player Init: " + name);
    }
    public MusicPlayer() {
    }
    private void Dispose(){
        System.out.println("Music Player Delete: " + name);
    }
    // IoC инверсия управления

    @Autowired
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer(Music music, String name, int volume) {
        this.music = music;
        this.name = name;
        this.volume = volume;
    }

    /*public MusicPlayer(List<Music> musicList, String name, int volume) {
        this.musicList = musicList;
        this.name = name;
        this.volume = volume;
    }*/

    public void playMusic() {
        System.out.println("Playing: " + music);
    }
    /*public void playMusic() {
        StringBuilder songs = new StringBuilder();
        for (Music music : musicList) {
            songs.append(music).append(" ");
        }
        System.out.println("Playing: " + songs);
    }*/
}
