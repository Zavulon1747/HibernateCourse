package aop;

import org.springframework.stereotype.Component;

@Component
public class OriginGameStore extends AbstractGameStore {
    @Override
    public void getGame() {
        System.out.println("We take a CD-disk with game from Origin");
    }

    public void returnGame() {
        System.out.println("We return game in Origin");
    }
}
