package energy_glow;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

//        ClassicalMusic music = applicationContext.getBean("musicBeanClassic", ClassicalMusic.class);
//        System.out.println(music.getSong());
//
//        MusicPlayer player = applicationContext.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer player2= applicationContext.getBean("musicPlayer", MusicPlayer.class);
//        player.setName("TestingName");
//        player.playMusic();
//        player2.playMusic();
//        System.out.println(player);
//        System.out.println(player2);
//
//        Owner owner = applicationContext.getBean("petOwner", Owner.class);
//        System.out.println(owner.getAnimal().voice());
        Music music = applicationContext.getBean("classicalMusic", Music.class);
        MusicPlayer player = new MusicPlayer(music);
        player.playMusic();

        Music music2 = applicationContext.getBean("rockMusic", Music.class);
        MusicPlayer player2 = new MusicPlayer(music2);
        player2.playMusic();

        applicationContext.close();
    }
}
