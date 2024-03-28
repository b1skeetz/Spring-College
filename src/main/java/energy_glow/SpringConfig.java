package energy_glow;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
//@ComponentScan("energy_glow")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }
    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }
    @Bean
    public PopMusic popMusic(){
        return new PopMusic();
    }
    @Bean
    public List<Music> genres(){
        return new ArrayList<>(Arrays.asList(classicalMusic(), rockMusic(), popMusic()));
    }
    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(genres());
    }
    @Bean
    public Computer computer(){
        return new Computer(musicPlayer());
    }
}
