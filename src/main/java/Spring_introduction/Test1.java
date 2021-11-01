package Spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        TwitchAnimal pet = context.getBean("myPet", TwitchAnimal.class);
        pet.say();

        context.close();
    }
}
