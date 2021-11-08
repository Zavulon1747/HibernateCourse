package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext contex = new AnnotationConfigApplicationContext(MyConfig.class);

//        OriginGameStore libraryOrig= contex.getBean("originGameStore", OriginGameStore.class);
//        libraryOrig.getGame();
//        libraryOrig.returnGame();

        Game game = contex.getBean("game", Game.class);

        ValveGameStore libraryValve = contex.getBean("valveGameStore", ValveGameStore.class);
        libraryValve.getGame(game);
//        libraryValve.getMusic(35, "sec");

        contex.close();
    }
}
