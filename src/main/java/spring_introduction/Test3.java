package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        TwitchAnimal pet = context.getBean("myPet", TwitchAnimal.class);
        Chat chat = context.getBean("myChat", Chat.class);
        chat.wathcYourStreamer();

        context.close();
    }
}
