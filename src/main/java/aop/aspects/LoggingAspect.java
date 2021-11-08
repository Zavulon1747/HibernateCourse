package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LoggingAspect {

//    @Pointcut("execution(* aop.ValveGameStore.*(..))")
//    private void allMethodsFromValveGameStore(){}
//
//    @Pointcut("execution(public void aop.ValveGameStore.returnMusic())")
//    private void returnMusicFromValveGameStore(){}
//
//    @Pointcut("allMethodsFromValveGameStore() && !returnMusicFromValveGameStore()")
//    private void allMethodsExceptReturnMusicFromValveGameStore() {}
//
////    @Before("allMethodsFromValveGameStore()")
////    public void beforeAllMethodsLoggingAdvice() {
////        System.out.println("For all methods --- Log#1");
////    }
////
////    @Before("returnMusicFromValveGameStore()")
////    public void beforeReturnMusicLoggingAdvice() {
////        System.out.println("For return music method --- Log#2");
////    }
//
//    @Before("allMethodsExceptReturnMusicFromValveGameStore()")
//    public void beforeAllMethodsExceptReturnMusicLoggingAdvice() {
//        System.out.println("For all methods EXCEPT ReturnMusic --- Log#3");
//    }


    //---------------------------------------------------------------------------------------------------


//    @Pointcut("execution(* aop.ValveGameStore.get*())")
//    private void allGetMethodsFromValveGameStore() {}
//
//    @Pointcut("execution(* aop.ValveGameStore.return*())")
//    private void allReturnMethodsFromValveGameStore() {}
//
//    @Pointcut("allGetMethodsFromValveGameStore() || allReturnMethodsFromValveGameStore()")
//    private void allGetAndReturnMethodsFromValveGameStore() {}
//
//    @Before("allGetMethodsFromValveGameStore()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: --- Log#1");
//    }
//
//    @Before("allReturnMethodsFromValveGameStore()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvice: --- Log#2");
//    }
//
//    @Before("allGetAndReturnMethodsFromValveGameStore()")
//    public void beforeGetAndReturnLoggingAdvice() {
//        System.out.println("beforeGetAndReturnLoggingAdvice: --- Log#3");
//    }


//-------------------------------------------------------------------------------------------





    @Before("aop.aspects.MyPointcuts.allGetMethods()")
    public void beforeGetGLoggingAdvice() {
        System.out.println("beforeGetGLoggingAdvice: логгирование попытки получить игру или музыку //Logg--Get");
    }



//    @Before("execution(* aop.OriginGameStore.return*(*))")
//    public void beforeReturnGameAdvice() {
//        System.out.println("beforeGetGameAdvice: попытка вернуть игру //Logg--Return");
//    }

}
