package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GameSchool {
    private List<Gamer> gamers = new ArrayList<>();

    public void addGamers() {
        Gamer gm1 = new Gamer("Ilias", 23, 7600);
        Gamer gm2 = new Gamer("Artem", 24, 3000);
        Gamer gm3 = new Gamer("Dmitriy", 24, 5000);
        gamers.add(gm1);
        gamers.add(gm2);
        gamers.add(gm3);
    }

    public List<Gamer> getGamers() {
        System.out.println("Начало работы метода getGamers()");
        System.out.println(gamers.get(3));
        System.out.println("Information from method getGamers");
        System.out.println(gamers);
        return gamers;
    }
}
