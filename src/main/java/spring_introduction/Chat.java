package spring_introduction;

public class Chat {
    private TwitchAnimal twitchAnimal;

    public Chat(TwitchAnimal twitchAnimal) {
        this.twitchAnimal = twitchAnimal;
    }

    public void wathcYourStreamer() {
        System.out.println("AYAYA");
        twitchAnimal.say();
    }
}
