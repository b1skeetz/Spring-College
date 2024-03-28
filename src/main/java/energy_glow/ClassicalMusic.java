package energy_glow;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@ToString
@Component
//@Scope("prototype")
@Qualifier("classicalMusic")
public class ClassicalMusic implements Music{
    private final List<String> songs = new ArrayList<>(Arrays.asList("Moonlight Sonata", "Turkish March",
            "Dance of the Knights"));
    private final Random random = new Random();

    @PostConstruct
    public void doMyInit(){
        System.out.println("Classical music is initialized...");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Bye bye, classical music...");
    }

    @Override
    public String getSong() {
        return songs.get(random.nextInt(songs.size()));
    }
}
