package aop;

import org.springframework.stereotype.Component;

@Component
public class ValveGameStore extends AbstractGameStore{

//    @Override
//    public void getGame(Game game) {
//        System.out.println("We take a CD-disk with game from Steam - " + game.getName());
//    }

    public void getGame() {
        System.out.println("We take a CD-disk with game from Steam");
    }

    public void returnGame() {
        System.out.println("We return game in Valve");
    }

    public void getMusic() {
        System.out.println("We take a CD-disk with music from Steam with time duration");
    }
}
