package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {
    @Around("execution(public String returnGame())") // @Around работает с target-методом, обязательно требуется обработать выходные данные
    public Object aroundReturnGameLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnGameLoggingAdvice: в библиотеку пытаются вернуть игру");
        Object targetMethodResult = "";
    try {
         targetMethodResult = proceedingJoinPoint.proceed();

    } catch (Exception e) {
        System.out.println("aroundReturnGameLoggingAdvice: было поймано исключение "+e);
        targetMethodResult = "&&&&&& Было проброшено исключение, тут было название книги ??????";
//        throw e;
    }

        System.out.println("aroundReturnGameLoggingAdvice: в библиотеку успешно вернули игру");

        return targetMethodResult;
    }
}
