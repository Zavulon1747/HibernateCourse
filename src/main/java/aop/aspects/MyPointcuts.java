package aop.aspects;

import org.aspectj.lang.annotation.Pointcut;


public class MyPointcuts {
    @Pointcut("execution(* add*(..))")    //parameter with * - it's only one parameter; .. - as many param as you like
    public void allAddMethods() {}
}
