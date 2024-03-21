package energy_glow;


public class ClassicalMusic implements Music{
//    private String song;
//    public void doMyInit(){
//        System.out.println("Initialization of class " + this.getClass() + "...");
//        song = "Rush E";
//    }
//
//    public void doMyDestroy(){
//        System.out.println("Distraction of class " + this.getClass() + "...");
//    }
    @Override
    public String getSong() {
        //return song;
        return "Moonlight Sonata";
    }

    @Override
    public String toString() {
        return getSong();
    }
}
