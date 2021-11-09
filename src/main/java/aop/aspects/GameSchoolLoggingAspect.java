package aop.aspects;

import aop.Gamer;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class GameSchoolLoggingAspect {

    @Before("execution(* getGamers())")
    public void beforeGetGamersLoggingAdvice() {
        System.out.println("beforeGetGamersLoggingAdvice: логируем получение списка игроков перед методом getGamers");
    }

    @AfterReturning(pointcut = "execution(* getGamers())", returning = "gamers")
    public void afterReturningGetGamersLoggingAdvice(List<Gamer> gamers) {
        Gamer firstGamer = gamers.get(0);
        String nameGamer = firstGamer.getName();
        nameGamer = "Crab " + nameGamer;
        firstGamer.setName(nameGamer);

        double avgSkillPoint = firstGamer.getAvgSkillPoint();
        avgSkillPoint += 200;
        firstGamer.setAvgSkillPoint(avgSkillPoint);

        System.out.println("afterReturningGetGamersLoggingAdvice: логируем получение списка игроков после метода getGamers");
    }



}
