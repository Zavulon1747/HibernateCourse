package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        GameSchool gameSchool = context.getBean("gameSchool", GameSchool.class);

        gameSchool.addGamers();
        List<Gamer> gamers = gameSchool.getGamers();
        System.out.println(gamers);

        context.close();
    }
}
