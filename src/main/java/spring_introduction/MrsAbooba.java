package spring_introduction;

import org.springframework.stereotype.Component;

@Component("aboobaBean")
public class MrsAbooba implements TwitchAnimal {

    MrsAbooba() {
        System.out.println("девочка...запустила стримчииик....");
    }

    @Override
    public void say() {
        System.out.println("Донатим, подписываемся");
    }
}
