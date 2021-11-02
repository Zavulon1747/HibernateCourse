package spring_introduction;

import java.util.Random;

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

    //For initialize some fields in game/application/web
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
