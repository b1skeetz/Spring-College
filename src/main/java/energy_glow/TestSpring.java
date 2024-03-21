package energy_glow;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer player = applicationContext.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer player2= applicationContext.getBean("musicPlayer", MusicPlayer.class);
        player.setName("TestingName");
        player.playMusic();
        player2.playMusic();
        System.out.println(player);
        System.out.println(player2);

        Owner owner = applicationContext.getBean("petOwner", Owner.class);
        System.out.println(owner.getAnimal().voice());

        applicationContext.close();
    }
}
