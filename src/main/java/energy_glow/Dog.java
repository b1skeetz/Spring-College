package energy_glow;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Dog implements Animal{
    @Override
    public String voice() {
        return "bark";
    }
}
