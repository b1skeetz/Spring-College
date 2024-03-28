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
        MusicPlayer player = applicationContext.getBean("myMusicPlayer", MusicPlayer.class);
        System.out.println(player.getName());
        System.out.println(player.getVolume());

        ClassicalMusic classicalMusic1 = applicationContext.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = applicationContext.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println(classicalMusic2 == classicalMusic1);


        Computer computer = applicationContext.getBean("computer", Computer.class);
        System.out.println(computer);

        applicationContext.close();
    }
}
