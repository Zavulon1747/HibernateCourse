package aop.aspects;

import org.aspectj.lang.annotation.Pointcut;


public class MyPointcuts {
    @Pointcut("execution(* get*())")    //parameter with * - it's only one parameter; .. - as many param as you like
    public void allGetMethods() {}
}
