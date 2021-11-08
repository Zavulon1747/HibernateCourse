package spring_introduction;

//@Component("aboobaBean")
//@Scope("singleton")
public class MrsAbooba implements TwitchAnimal {

    MrsAbooba() {
        System.out.println("девочка...запустила стримчииик.... //Abooba was created");
    }

    @Override
    public void say() {
        System.out.println("Донатим, подписываемся");
    }

//    @PostConstruct
//    public void init() {
//        System.out.println("Создаём опросик, чатиик...");
//    }
//
//    @PreDestroy
//    public void destroy() {
//        System.out.println("Дестрой май пуссииии...");
//    }


}
