package spring_introduction;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MrTwitchStreamer implements TwitchAnimal {
    private String name;
    public int countOfViewers;
    Random random = new Random();

    @Override
    public void say() {
        System.out.println("ДО ПОБАЧЕНЯ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MrTwitchStreamer() {
        System.out.println("XAXAXAXAXAXAXAXAXA");
    }

    //For initialize some fields in game/application/web
    //Method is created for every beans even it is singleton or prototype scopes
    private void init() {
        countOfViewers = 0;
        System.out.println("Стрим запускается. Количество зрителей на начале: "+countOfViewers);
        for (int i = 3; i > 0; i--) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
            countOfViewers= countOfViewers + random.nextInt(301);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Стрим запущен. Количество зрителей: "+countOfViewers);
    }

    //Throws some notes/information ...ets.
    //Runs only for singleton. If bean gets prototype scope you have to
    // write destroy-method by yourself
    private void destroy() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        countOfViewers+= random.nextInt(1000);
        say();
        System.out.println("Стрим завершён. На момент оффа Вас смотрело: "+countOfViewers);
    }
}
