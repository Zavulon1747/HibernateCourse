package aop.aspects;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class GameSchoolLoggingAspect {

//    @Before("execution(* getGamers())")
//    public void beforeGetGamersLoggingAdvice() {
//        System.out.println("beforeGetGamersLoggingAdvice: логируем получение списка игроков перед методом getGamers");
//    }
//
//    @AfterReturning(pointcut = "execution(* getGamers())", returning = "gamers")
//    public void afterReturningGetGamersLoggingAdvice(List<Gamer> gamers) {
//        Gamer firstGamer = gamers.get(0);
//        String nameGamer = firstGamer.getName();
//        nameGamer = "Crab " + nameGamer;
//        firstGamer.setName(nameGamer);
//
//        double avgSkillPoint = firstGamer.getAvgSkillPoint();
//        avgSkillPoint += 200;
//        firstGamer.setAvgSkillPoint(avgSkillPoint);
//
//        System.out.println("afterReturningGetGamersLoggingAdvice: логируем получение списка игроков после метода getGamers");
//    }

    @AfterThrowing(pointcut="execution(* getGamers())", throwing = "exception")
    public void afterThrowingGetGamersLoggingAdvice(Throwable exception) {
// afterThrowingGetGamersLoggingAdvice: логгируем выброс исключения java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3
        System.out.println("afterThrowingGetGamersLoggingAdvice: логгируем выброс исключения " +exception);
    }


}
