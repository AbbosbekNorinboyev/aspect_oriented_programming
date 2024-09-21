package uz.pdp.aopjavaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Performance performance = container.getBean(Performance.class);
        performance.perform();
    }
}
