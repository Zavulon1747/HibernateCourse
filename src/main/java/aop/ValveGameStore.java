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
        System.out.println("------------------------------------------------------");
    }

    public String returnGame() {
        int a = 10/0;
        System.out.println("We return game in Valve");
        return "Her Story";
    }

    public void getMusic() {
        System.out.println("We take a CD-disk with music from Steam");
        System.out.println("------------------------------------------------------");
    }

    public void returnMusic() {
        System.out.println("We return a CD-disk with music in Steam");
        System.out.println("------------------------------------------------------");
    }

    public void addGame(String person_name, Game game) {
        System.out.println("The game is added");
        System.out.println("------------------------------------------------------");
    }

    public void addMusic() {
        System.out.println("The composition is added");
        System.out.println("------------------------------------------------------");
    }
}
