package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("Method main is started+++");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        ValveGameStore library = context.getBean("valveGameStore", ValveGameStore.class);
        String gameName = library.returnGame();
        System.out.println("В библиотеку вернули игру "+ gameName);

        context.close();
        System.out.println("Method main is finished");
    }
    }
