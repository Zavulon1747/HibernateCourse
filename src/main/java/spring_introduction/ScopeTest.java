package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");

        MrsAbooba abooba1 = context.getBean("aboobaBean", MrsAbooba.class);
//
//        MrsAbooba abooba2 = context.getBean("aboobaBean", MrsAbooba.class);
//
        abooba1.say();
//        abooba2.say();
//
//        System.out.println(abooba1.equals(abooba2));

        context.close();

    }
}
