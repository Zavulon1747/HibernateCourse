package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        GameSchool gameSchool = context.getBean("gameSchool", GameSchool.class);

        gameSchool.addGamers();
        try {
            List<Gamer> gamers = gameSchool.getGamers();
            System.out.println(gamers);                         // afterThrowingGetGamersLoggingAdvice: логгируем выброс исключения
        } catch (Exception e) {
            System.out.println("Было поймано исключение " + e);  // Было поймано исключение java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3
        }

        context.close();
    }
}
