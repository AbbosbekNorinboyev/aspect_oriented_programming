package uz.pdp.task1.aopjavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class Config {
    @Bean
    public TransformAspect1 transformAspect1() {
        return new TransformAspect1();
    }

    @Bean
    public Transform1 transform1() {
        return new Transform1();
    }
}
