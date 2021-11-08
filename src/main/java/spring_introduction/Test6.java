package spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Chat chat = context.getBean("chatBean", Chat.class);

        chat.watchYourStreamer();

//        TwitchAnimal abooba1 = context.getBean("aboobaBean", TwitchAnimal.class);
//        TwitchAnimal abooba2 = context.getBean("aboobaBean", TwitchAnimal.class);


        context.close();
    }
}
