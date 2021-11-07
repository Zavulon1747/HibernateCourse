package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        //Annotation @Component("aboobaBean"),  if just @Component -> use ("mrsAbooba"), if name of class is
        //SQLApplication -> use ('SQLApplication")
//        MrsAbooba abooba = context.getBean("aboobaBean", MrsAbooba.class);
//        abooba.say();

        Chat chat = context.getBean("chatBean", Chat.class);

        chat.watchYourStreamer();

        context.close();
    }
}
