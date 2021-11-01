package spring_introduction;

public class Chat {
    private TwitchAnimal twitchAnimal;

    public Chat() {

    }

    public void setTwitchAnimal(TwitchAnimal twitchAnimal) {
        System.out.println("ЗДАРОВА, РАБОТЯГИ");
        this.twitchAnimal = twitchAnimal;
    }

    public void watchYourStreamer() {
        System.out.println("AYAYA");
        twitchAnimal.say();
    }
}
