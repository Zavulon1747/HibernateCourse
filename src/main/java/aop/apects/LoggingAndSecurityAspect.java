package aop.apects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Pointcut("execution(* get*())")    //parameter with * - it's only one parameter; .. - as many param as you like
    private void allGetMethods() {}

    @Before("allGetMethods()")
    public void beforeGetGLoggingAdvice() {
        System.out.println("beforeGetGLoggingAdvice: попытка получить игру или музыку //Logg--Get");
    }

    @Before("allGetMethods()")
    public void beforeGetSecurityAdvice() {
        System.out.println("beforeGetSecurityAdvice: проверка прав на получение игры или музыки //Logg--Get");
    }

//    @Before("execution(* aop.OriginGameStore.return*(*))")
//    public void beforeReturnGameAdvice() {
//        System.out.println("beforeGetGameAdvice: попытка вернуть игру //Logg--Return");
//    }

}
