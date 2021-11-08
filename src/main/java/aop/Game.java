package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Game {
    @Value("Bayonetta")
    private String name;

    public String getName() {
        return name;
    }
}
