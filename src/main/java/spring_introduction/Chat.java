package spring_introduction;


import org.springframework.beans.factory.annotation.Value;

//@Component("chatBean")
public class Chat { //
//    @Autowired
//    @Qualifier("aboobaBean")
    private TwitchAnimal twitchAnimal;
    @Value("${chat.nickname}")
    private String nickname;
    @Value("${chat.age}")
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

//    @Autowired
//    public Chat(@Qualifier("aboobaBean")TwitchAnimal twitchAnimal) { //Qualifier has the others ElementTypes
//        System.out.println("ZDAROVA, RABOTYAGI! YA V LEGO, =)");
//        this.twitchAnimal = twitchAnimal;
//    }

    public Chat(TwitchAnimal twitchAnimal) {
        System.out.println("ZDAROVA, RABOTYAGI! YA V LEGO, =) //Chat was created");
        this.twitchAnimal = twitchAnimal;
    }

//    @Autowired
    //@Qualifier("aboobaBean")
    public void setTwitchAnimal(TwitchAnimal twitchAnimal) {
        System.out.println("ЗДАРОВА, РАБОТЯГИ //Chat setter");
        this.twitchAnimal = twitchAnimal;
    }

    public void watchYourStreamer() {
        System.out.print(getNickname() + getAge() + " said: \"");
        System.out.println("AYAYA\"");
        twitchAnimal.say();

    }
}
