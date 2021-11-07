package spring_introduction;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("chatBean")
public class Chat {
//    @Autowired
//    @Qualifier("aboobaBean")
    private TwitchAnimal twitchAnimal;
    private String nickname;
    private int age;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Chat() {
        System.out.println("AYAYA //default construction Chat()");
    }

    @Autowired
    public Chat(@Qualifier("aboobaBean")TwitchAnimal twitchAnimal) { //Qualifier has the others ElementTypes
        System.out.println("ZDAROVA, RABOTYAGI! YA V LEGO, =)");
        this.twitchAnimal = twitchAnimal;
    }

//    @Autowired
    //@Qualifier("aboobaBean")
    public void setTwitchAnimal(TwitchAnimal twitchAnimal) {
        System.out.println("ЗДАРОВА, РАБОТЯГИ //setter");
        this.twitchAnimal = twitchAnimal;
    }

    public void watchYourStreamer() {
        System.out.print(getNickname() + getAge() + " said: \"");
        System.out.println("AYAYA\"");
        twitchAnimal.say();

    }
}
