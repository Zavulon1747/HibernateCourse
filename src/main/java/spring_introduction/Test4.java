package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        MrTwitchStreamer twitchStreamer = context.getBean("myPet", MrTwitchStreamer.class);
//        twitchStreamer.setName("PAPICH");
//        MrTwitchStreamer yourTwitchStreamer = context.getBean("myPet", MrTwitchStreamer.class);
//        yourTwitchStreamer.setName("NIX");

//        System.out.println(twitchStreamer.getName());
//        System.out.println(yourTwitchStreamer.getName());
//
//        System.out.println(twitchStreamer.equals(yourTwitchStreamer));
//        twitchStreamer.say();

        context.close();
    }
}
