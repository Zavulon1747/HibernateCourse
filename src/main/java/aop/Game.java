package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Game {
    @Value("Bayonetta")
    private String name;
    @Value("Beat 'em up")
    private String genre;

    public String getGenre() {
        return genre;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    @Value("2009")
    private int releaseDate;

    public String getName() {
        return name;
    }
}
