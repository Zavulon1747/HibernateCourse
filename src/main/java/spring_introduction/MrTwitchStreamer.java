package spring_introduction;

public class MrTwitchStreamer implements TwitchAnimal {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    @Override
    public void say() {
        System.out.println("ДО ПОБАЧЕНЯ");
    }
}
