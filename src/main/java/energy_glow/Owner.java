package energy_glow;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Owner {
    private String name;
    private Animal animal;
    public Owner(){

    }

    public Owner(String name, Animal animal) {
        this.name = name;
        this.animal = animal;
    }
}
