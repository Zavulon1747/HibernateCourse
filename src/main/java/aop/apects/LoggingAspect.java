package aop.apects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(public void get*())")
    public void beforeGetGameAdvice() {
        System.out.println("beforeGetGameAdvice: попытка получить игру //Logg--Get");
    }
    @Before("execution(* aop.OriginGameStore.return*())")
    public void beforeReturnGameAdvice() {
        System.out.println("beforeGetGameAdvice: попытка вернуть игру //Logg--Return");
    }

}
