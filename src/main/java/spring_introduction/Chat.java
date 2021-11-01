package spring_introduction;

public class Chat {
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

    }

    public void setTwitchAnimal(TwitchAnimal twitchAnimal) {
        System.out.println("ЗДАРОВА, РАБОТЯГИ");
        this.twitchAnimal = twitchAnimal;
    }

    public void watchYourStreamer() {
        System.out.print(getNickname() + getAge() + " said: \"");
        System.out.println("AYAYA\"");
        twitchAnimal.say();
    }
}
