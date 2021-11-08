package spring_introduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
//@ComponentScan("spring_introduction")
@PropertySource("classpath:myApp.properties")
public class MyConfig {

    @Bean //BeanId - name of method ("aboobaBean")
    @Scope("singleton")
    public TwitchAnimal aboobaBean() {
        return new MrsAbooba();
    }

    @Bean
    public Chat chatBean() {
        return new Chat(aboobaBean());
    }

}
