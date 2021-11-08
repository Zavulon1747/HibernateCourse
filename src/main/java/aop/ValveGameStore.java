package aop;

import org.springframework.stereotype.Component;

@Component
public class ValveGameStore extends AbstractGameStore{

    @Override
    public void getGame() {
        System.out.println("We take a CD-disk with game from Steam");
    }

    public void getMusic() {
        System.out.println("We take a CD-disk with music from Steam");
    }
}
