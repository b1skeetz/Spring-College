package energy_glow;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{
    private String song = "Moonlight Sonata";
    public void doMyInit(){
        System.out.println("Initialization of class " + this.getClass() + "...");
        song = "Rush E";
    }

    public void doMyDestroy(){
        System.out.println("Distraction of class " + this.getClass() + "...");
    }
    private static ClassicalMusic instance;
    private ClassicalMusic(){

    }
    public static ClassicalMusic getClassicalMusicInstance(){
        if(instance == null){
            instance = new ClassicalMusic();
        }
        return instance;
    }
    @Override
    public String getSong() {
        return song;
    }

    @Override
    public String toString() {
        return getSong();
    }
}
