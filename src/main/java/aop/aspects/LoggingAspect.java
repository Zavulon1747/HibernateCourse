package aop.aspects;

import aop.Game;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
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




    @Before("aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = "+methodSignature);
        System.out.println("methodSignature.getMethod() = "+methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = "+methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = "+methodSignature.getName());

        if (methodSignature.getName().equals("addGame")) {
            Object[] arguments = joinPoint.getArgs();
            for(Object arg: arguments) {
                if (arg instanceof Game) {
                    Game myGame = (Game) arg;
                    System.out.println("Information about game: name - "+myGame.getName()+", genre - "+myGame.getGenre()+", release date - "+myGame.getReleaseDate());
                } else if (arg instanceof String) {
                    System.out.println("Игру в библиотеку добавляет - "+ arg);
                }
            }
        }

        System.out.println("beforeGetGLoggingAdvice: логгирование попытки получить игру или музыку //Logg--Get");
        System.out.println("------------------------------------------------------");
    }



//    @Before("execution(* aop.OriginGameStore.return*(*))")
//    public void beforeReturnGameAdvice() {
//        System.out.println("beforeGetGameAdvice: попытка вернуть игру //Logg--Return");
//    }

}
