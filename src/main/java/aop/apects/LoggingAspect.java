package aop.apects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(public void get*(aop.Game, ..))") //parameter with * - it's only one parameter; .. - as many param as you like
    public void beforeGetGameAdvice() {
        System.out.println("beforeGetGameAdvice: попытка получить игру //Logg--Get");
    }
    @Before("execution(* aop.OriginGameStore.return*(*))")
    public void beforeReturnGameAdvice() {
        System.out.println("beforeGetGameAdvice: попытка вернуть игру //Logg--Return");
    }

}
