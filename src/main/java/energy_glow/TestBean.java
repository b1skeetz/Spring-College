package energy_glow;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TestBean {
    private String name;

    public TestBean(String name) {
        this.name = name;
    }
}
