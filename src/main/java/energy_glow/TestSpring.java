package energy_glow;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer player = applicationContext.getBean("musicPlayer", MusicPlayer.class);
        player.playMusic();
        System.out.println(player);

        applicationContext.close();
    }
}
